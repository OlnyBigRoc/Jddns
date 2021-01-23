package cn.bigroc.jddns.model.dnspod.entity;

import java.util.Date;

/**
 * @author onlybigroc
 * See { @linktourl http://onlybigroc.cn}
 * @date 2020/10/29 21:01
 */
public class Record {
    private String id;
    private String name;
    private String type;
    private String sub_domain;
    private String record_type;
    private String record_line;
    private String record_line_id;
    private String value;
    private String weight;
    private String mx;
    private String ttl;
    private String enabled;
    private String monitor_status;
    private String remark;
    private Date updated_on;
    private String domain_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSub_domain() {
        return sub_domain;
    }

    public void setSub_domain(String sub_domain) {
        this.sub_domain = sub_domain;
    }

    public String getRecord_type() {
        return record_type;
    }

    public void setRecord_type(String record_type) {
        this.record_type = record_type;
    }

    public String getRecord_line() {
        return record_line;
    }

    public void setRecord_line(String record_line) {
        this.record_line = record_line;
    }

    public String getRecord_line_id() {
        return record_line_id;
    }

    public void setRecord_line_id(String record_line_id) {
        this.record_line_id = record_line_id;
    }

    public void setLine_id(String line_id) {
        this.record_line_id = line_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMx() {
        return mx;
    }

    public void setMx(String mx) {
        this.mx = mx;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getMonitor_status() {
        return monitor_status;
    }

    public void setMonitor_status(String monitor_status) {
        this.monitor_status = monitor_status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(Date updated_on) {
        this.updated_on = updated_on;
    }

    public String getDomain_id() {
        return domain_id;
    }

    public void setDomain_id(String domain_id) {
        this.domain_id = domain_id;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sub_domain='" + sub_domain + '\'' +
                ", record_type='" + record_type + '\'' +
                ", record_line='" + record_line + '\'' +
                ", record_line_id='" + record_line_id + '\'' +
                ", value='" + value + '\'' +
                ", weight='" + weight + '\'' +
                ", mx='" + mx + '\'' +
                ", ttl='" + ttl + '\'' +
                ", enabled='" + enabled + '\'' +
                ", monitor_status='" + monitor_status + '\'' +
                ", remark='" + remark + '\'' +
                ", updated_on=" + updated_on +
                ", domain_id='" + domain_id + '\'' +
                '}';
    }
}
