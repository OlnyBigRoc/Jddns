package cn.bigroc.jddns.model.dnspod;

import cn.bigroc.jddns.model.dnspod.entity.Domain;
import cn.bigroc.jddns.model.dnspod.entity.Record;
import cn.bigroc.jddns.utils.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 * DNSPOD API
 * DNSPOD 接口解析操作库
 * http://www.dnspod.cn/docs/domains.html
 *
 * @author lipeng
 * @date 2020/11/1 22:40
 */
@Component
public class Dnspod {
    private final Logger log = LoggerFactory.getLogger(Dnspod.class);

    /**
     * 域名信息
     */
    final String DOMAIN_INFO = "https://dnsapi.cn/Domain.Info";
    /**
     * 记录列表
     */
    final String LIST = "https://dnsapi.cn/Record.List";
    /**
     * 修改记录
     */
    final String MODIFY = "https://dnsapi.cn/Record.Modify";
    /**
     * 单条记录查询
     */
    final String INFO = "https://dnsapi.cn/Record.Info";
    /**
     * 更新动态 DNS 记录
     */
    final String DDNS = "https://dnsapi.cn/Record.Ddns";

    @Value("${token}")
    private String loginToken;

    @Value("${domain}")
    private String domain;

    /**
     * 子级域名
     */
    private String subDomain = null;
    /**
     * 域名id
     */
    private String domainId;

    /**
     * 缓存需要修改的记录
     */
    private Record record;

    public void run(String newIp) throws IOException {
        if(null == record){
            getDomain();
            getDomainId();
            getRecord();
            if(null == record){
                return;
            }
        }else{
            info();
        }
        String oldIp = record.getValue();
        log.info("old IP :      【{}】", oldIp);
        log.info("new IP :      【{}】", newIp);
        if(!newIp.equals(oldIp)){
            modify(newIp);
        }
    }

    /**
     * 1、分隔二级域名
     */
    public void getDomain() {
        String[] split = domain.split("\\.");
        if (split.length != 2) {
            String domain = split[split.length - 2] + "." + split[split.length - 1];
            subDomain = this.domain.substring(0, this.domain.indexOf(domain) - 1);
            this.domain = split[split.length - 2] + "." + split[split.length - 1];
        }
    }

    /**
     * 2、获取domainId
     *
     * @throws IOException 异常
     */
    public void getDomainId() throws IOException {
        if (null == domainId || domainId.trim().length() == 0) {
            String urlParameters = "login_token=" + loginToken + "&format=json&domain=" + domain;
            String res = HttpUtil.sendPost(DOMAIN_INFO, urlParameters);
            JSONObject parse = (JSONObject) JSON.parse(res);
            if (parse.containsKey("domain")) {
                Domain domain = JSON.toJavaObject((JSON) parse.get("domain"), Domain.class);
                domainId = domain.getId();
            }
        }
    }

    /**
     * 3、记录信息
     * @throws IOException 网络异常
     */
    public void getRecord() throws IOException {
        String urlParameters = "login_token=" + loginToken + "&format=json&domain_id=" + domainId;
        String res = HttpUtil.sendPost(LIST, urlParameters);
        JSONObject parse = (JSONObject) JSON.parse(res);
        if (parse.containsKey("records")) {
            List<Record> records = JSON.parseArray(JSON.toJSONString(parse.get("records")), Record.class);
            Optional<Record> first;
            if (null != subDomain && subDomain.trim().length() != 0) {
                first = records.stream().filter(e -> e.getName().equals(subDomain)).findFirst();
            } else {
                first = records.stream().filter(e -> e.getName().equals("@") && e.getType().equals("A")).findFirst();
            }
            first.ifPresent(value -> record = value);
        }
    }

    /**
     * 获取记录信息
     */
    public void info() throws IOException {
        String urlParameters = "login_token=" + loginToken + "&format=json&domain_id="+domainId+"&record_id="+record.getId();
        String res = HttpUtil.sendPost(INFO, urlParameters);
        JSONObject parse = (JSONObject) JSON.parse(res);
        if (parse.containsKey("record")) {
            record = JSON.toJavaObject((JSON) parse.get("record"), Record.class);
        }
    }

    /**
     * 修改记录ip
     *
     * @param ip 公网ip
     */
    public void modify(String ip) throws IOException {
        String urlParameters = "login_token=" + loginToken + "&format=json&domain_id="+domainId+"&record_id="+record.getId()+"&sub_domain=bt&value=" + ip + "&record_type=A&record_line_id="+record.getRecord_line_id();
        String res = HttpUtil.sendPost(MODIFY, urlParameters);
        log.info("modify result:【{}】", res);
    }
}
