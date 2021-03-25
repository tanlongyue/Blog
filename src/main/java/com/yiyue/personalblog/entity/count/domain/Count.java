package com.yiyue.personalblog.entity.count.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * count
 * @author 
 */
public class Count implements Serializable {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 来访IP
     */
    private String ip;

    /**
     * 来访IP地址
     */
    private String ipaddress;

    /**
     * 记录时间
     */
    private Date recorddate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }
}