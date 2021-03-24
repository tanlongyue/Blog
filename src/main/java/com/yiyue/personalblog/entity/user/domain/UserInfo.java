package com.yiyue.personalblog.entity.user.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * user_info
 * @author 
 */
@Data
public class UserInfo implements Serializable {
    /**
     * 自增Id
     */
    private Integer id;

    /**
     * 用户昵称
     */
    private String userNickName;

    /**
     * 用户登陆用户名
     */
    private String userLoginName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 加密（盐）
     */
    private String salt;

    /**
     * 用户电话号码
     */
    private String userPhone;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 男，女
     */
    private String userSex;

    /**
     * 用户头像
     */
    private String userHeadPortrait;

    /**
     * 用户角色
     */
    private String userRoleId;

    /**
     * 创建者Id(Id)
     */
    private Long createby;

    /**
     * 创建时间
     */
    private Date createdate;

    /**
     * 更新者Id(Id)
     */
    private Long modifyby;

    /**
     * 更新时间
     */
    private Date modifydate;

    /**
     * 备用字段
     */
    private String spareone;

    /**
     * 备用字段2
     */
    private String sparetwo;

    /**
     * 备用字段3
     */
    private String sparethree;

    /**
     * 备用字段4
     */
    private String sparefour;

    /**
     * 角色集合
     * */
    private List<Role> roleList;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserHeadPortrait() {
        return userHeadPortrait;
    }

    public void setUserHeadPortrait(String userHeadPortrait) {
        this.userHeadPortrait = userHeadPortrait;
    }

    public String getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Long getCreateby() {
        return createby;
    }

    public void setCreateby(Long createby) {
        this.createby = createby;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getSpareone() {
        return spareone;
    }

    public void setSpareone(String spareone) {
        this.spareone = spareone;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public String getSparetwo() {
        return sparetwo;
    }

    public void setSparetwo(String sparetwo) {
        this.sparetwo = sparetwo;
    }

    public String getSparethree() {
        return sparethree;
    }

    public void setSparethree(String sparethree) {
        this.sparethree = sparethree;
    }

    public String getSparefour() {
        return sparefour;
    }

    public void setSparefour(String sparefour) {
        this.sparefour = sparefour;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}