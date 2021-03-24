package com.yiyue.personalblog.entity.user.domain;

import java.io.Serializable;

/**
 * permission
 * @author 
 */
public class Permission implements Serializable {
    /**
     * 自增Id
     */
    private Integer id;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     * 接口路径
     */
    private String permissionUrl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }
}