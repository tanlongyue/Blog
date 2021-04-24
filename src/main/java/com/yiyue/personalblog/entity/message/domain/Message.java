package com.yiyue.personalblog.entity.message.domain;

import com.yiyue.personalblog.entity.user.domain.UserInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * message
 * @author 
 */
public class Message implements Serializable {
    /**
     * 留言主键Id
     */
    private Integer messageid;

    /**
     * 用户Id
     */
    private Integer userid;

    /**
     * 被回复者Id
     */
    private Integer parentmessageid;

    /**
     * 留言内容
     */
    private String content;

    /**
     * 是否置顶，0置顶，1不置顶
     */
    private String messagetop;

    /**
     * 创建时间
     */
    private Date createtime;


    /**
     * 留言用户信息
     * */
    private UserInfo userInfo;

    private List<Message> replyMessagesList = new ArrayList<>();//回复留言

    private Message parentMessage;      //父留言

    public List<Message> getReplyMessagesList() {
        return replyMessagesList;
    }

    public void setReplyMessagesList(List<Message> replyMessagesList) {
        this.replyMessagesList = replyMessagesList;
    }

    public Message getParentMessage() {
        return parentMessage;
    }

    public void setParentMessage(Message parentMessage) {
        this.parentMessage = parentMessage;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    private static final long serialVersionUID = 1L;

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getParentmessageid() {
        return parentmessageid;
    }

    public void setParentmessageid(Integer parentmessageid) {
        this.parentmessageid = parentmessageid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessagetop() {
        return messagetop;
    }

    public void setMessagetop(String messagetop) {
        this.messagetop = messagetop;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}