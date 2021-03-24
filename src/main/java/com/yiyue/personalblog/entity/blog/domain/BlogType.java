package com.yiyue.personalblog.entity.blog.domain;

import java.io.Serializable;

/**
 * blog_type
 * @author 
 */
public class BlogType implements Serializable {
    /**
     * 博客分类主键
     */
    private Integer typeid;

    /**
     * 博客分类名
     */
    private String typename;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}