package cn.bigroc.ddns.task;


import cn.bigroc.ddns.model.dnspod.Dnspod;
import cn.bigroc.ddns.utils.IpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author lipeng
 * @date 2020/10/28 17:31
 */
@Component
public class DdnsTask {

    private static final Logger log = LoggerFactory.getLogger(DdnsTask.class);

    @Autowired
    private Dnspod dnspod;

    @Scheduled(cron = "0 0/5 * * * ?")
    public void run() throws IOException {
        String nowIp = IpUtil.getPublicIp();
        dnspod.run(nowIp);
    }

}
