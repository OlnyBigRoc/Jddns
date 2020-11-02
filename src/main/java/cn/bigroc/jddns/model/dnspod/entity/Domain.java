package cn.bigroc.jddns.model.dnspod.entity;

import java.util.Date;
import java.util.List;

/**
 * @author lipeng
 * @date 2020/11/1 23:51
 */
public class Domain {
        private String id;
        private String is_vip;
        private String name;
        private String punycode;
        private String grade;
        private int grade_level;
        private String grade_title;
        private String status;
        private String ext_status;
        private String records;
        private String group_id;
        private String is_mark;
        private String remark;
        private String user_id;
        private Date created_on;
        private Date updated_on;
        private String ttl;
        private String owner;
        private String cname_speedup;
        private String searchengine_push;
        private String is_qcloud_reg;
        private String uin;
        private String owner_nick;
        private Date vip_start_at;
        private Date vip_end_at;
        private String vip_auto_renew;
        private List<String> now_ns;
        private List<String> dnspod_ns;
        private int q_project_id;
        private String is_beian;

        public void setId(String id) {
            this.id = id;
        }
        public String getId() {
            return id;
        }

        public void setIs_vip(String is_vip) {
            this.is_vip = is_vip;
        }
        public String getIs_vip() {
            return is_vip;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setPunycode(String punycode) {
            this.punycode = punycode;
        }
        public String getPunycode() {
            return punycode;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }
        public String getGrade() {
            return grade;
        }

        public void setGrade_level(int grade_level) {
            this.grade_level = grade_level;
        }
        public int getGrade_level() {
            return grade_level;
        }

        public void setGrade_title(String grade_title) {
            this.grade_title = grade_title;
        }
        public String getGrade_title() {
            return grade_title;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        public String getStatus() {
            return status;
        }

        public void setExt_status(String ext_status) {
            this.ext_status = ext_status;
        }
        public String getExt_status() {
            return ext_status;
        }

        public void setRecords(String records) {
            this.records = records;
        }
        public String getRecords() {
            return records;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }
        public String getGroup_id() {
            return group_id;
        }

        public void setIs_mark(String is_mark) {
            this.is_mark = is_mark;
        }
        public String getIs_mark() {
            return is_mark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
        public String getRemark() {
            return remark;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }
        public String getUser_id() {
            return user_id;
        }

        public void setCreated_on(Date created_on) {
            this.created_on = created_on;
        }
        public Date getCreated_on() {
            return created_on;
        }

        public void setUpdated_on(Date updated_on) {
            this.updated_on = updated_on;
        }
        public Date getUpdated_on() {
            return updated_on;
        }

        public void setTtl(String ttl) {
            this.ttl = ttl;
        }
        public String getTtl() {
            return ttl;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }
        public String getOwner() {
            return owner;
        }

        public void setCname_speedup(String cname_speedup) {
            this.cname_speedup = cname_speedup;
        }
        public String getCname_speedup() {
            return cname_speedup;
        }

        public void setSearchengine_push(String searchengine_push) {
            this.searchengine_push = searchengine_push;
        }
        public String getSearchengine_push() {
            return searchengine_push;
        }

        public void setIs_qcloud_reg(String is_qcloud_reg) {
            this.is_qcloud_reg = is_qcloud_reg;
        }
        public String getIs_qcloud_reg() {
            return is_qcloud_reg;
        }

        public void setUin(String uin) {
            this.uin = uin;
        }
        public String getUin() {
            return uin;
        }

        public void setOwner_nick(String owner_nick) {
            this.owner_nick = owner_nick;
        }
        public String getOwner_nick() {
            return owner_nick;
        }

        public void setVip_start_at(Date vip_start_at) {
            this.vip_start_at = vip_start_at;
        }
        public Date getVip_start_at() {
            return vip_start_at;
        }

        public void setVip_end_at(Date vip_end_at) {
            this.vip_end_at = vip_end_at;
        }
        public Date getVip_end_at() {
            return vip_end_at;
        }

        public void setVip_auto_renew(String vip_auto_renew) {
            this.vip_auto_renew = vip_auto_renew;
        }
        public String getVip_auto_renew() {
            return vip_auto_renew;
        }

        public void setNow_ns(List<String> now_ns) {
            this.now_ns = now_ns;
        }
        public List<String> getNow_ns() {
            return now_ns;
        }

        public void setDnspod_ns(List<String> dnspod_ns) {
            this.dnspod_ns = dnspod_ns;
        }
        public List<String> getDnspod_ns() {
            return dnspod_ns;
        }

        public void setQ_project_id(int q_project_id) {
            this.q_project_id = q_project_id;
        }
        public int getQ_project_id() {
            return q_project_id;
        }

        public void setIs_beian(String is_beian) {
            this.is_beian = is_beian;
        }
        public String getIs_beian() {
            return is_beian;
        }
}
