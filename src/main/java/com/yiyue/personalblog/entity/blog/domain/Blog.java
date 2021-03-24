package com.yiyue.personalblog.entity.blog.domain;

import com.yiyue.personalblog.entity.user.domain.UserInfo;

import java.io.Serializable;
import java.util.Date;

/**
 * blog
 * @author 
 */
public class Blog implements Serializable {
    /**
     * 主键
     */
    private Integer blogid;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 首图地址
     */
    private String firstpicture;

    /**
     * 标签，原创等
     */
    private String tab;

    /**
     * 浏览次数
     */
    private Integer views;

    /**
     * 评论次数
     */
    private Integer commentcount;

    /**
     * 开启赞赏默认为0，（0为打开，1为关闭）
     */
    private String appreciation;

    /**
     * 开启版权声明默认为0，（0为打开，1为关闭）
     */
    private String sharestatement;

    /**
     * 是否开启评论默认为0，（0为打开，1为关闭）
     */
    private String commentbled;

    /**
     * 是否发布默认为0，（0为发布，1为不发布）
     */
    private String published;

    /**
     * 是否成为最新推荐默认为1，（0为打开，1为关闭）
     */
    private String recommend;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 博客描述
     */
    private String description;

    /**
     * 分类id
     */
    private Integer typeid;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 分页
     * */
    private Integer pageNum;

    private Integer pageSize;

    /**
     * 文章分类
     * */
    private BlogType blogType;

    /**
     * 文章对应的人物
     * */
    private UserInfo userInfo;

    public void setBlogType(BlogType blogType) {
        this.blogType = blogType;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public BlogType getBlogType() {
        return blogType;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    private static final long serialVersionUID = 1L;

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirstpicture() {
        return firstpicture;
    }

    public void setFirstpicture(String firstpicture) {
        this.firstpicture = firstpicture;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    public String getSharestatement() {
        return sharestatement;
    }

    public void setSharestatement(String sharestatement) {
        this.sharestatement = sharestatement;
    }

    public String getCommentbled() {
        return commentbled;
    }

    public void setCommentbled(String commentbled) {
        this.commentbled = commentbled;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}