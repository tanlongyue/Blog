package com.yiyue.personalblog.entity.user.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * role_permission
 * @author 
 */
@Data
public class RolePermission implements Serializable {
    /**
     * 自增Id
     */
    private Integer id;

    /**
     * 角色关联Id
     */
    private Integer roleId;

    /**
     * 权限Id
     */
    private Integer permissionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}