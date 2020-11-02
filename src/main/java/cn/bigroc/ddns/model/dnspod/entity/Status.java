package cn.bigroc.ddns.model.dnspod.entity;

import java.util.Date;

/**
 * @author lipeng
 * @date 2020/11/1 23:49
 */
public class Status {

    private String code;
    private String message;
    private Date created_at;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getCreated_at() {
        return created_at;
    }
}
