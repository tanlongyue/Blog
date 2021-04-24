package com.yiyue.personalblog.service.message.impl;


import com.yiyue.personalblog.constants.Constants;
import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.entity.message.domain.Message;
import com.yiyue.personalblog.entity.message.example.MessageExample;
import com.yiyue.personalblog.mapper.message.MessageMapper;
import com.yiyue.personalblog.service.message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    List<Message> reposlyMessage = new ArrayList<>();
    @Override
    public Integer selectCount() {
        return messageMapper.selectCount();
    }

    @Override
    public JsonData queryMessageAll() {

        /**
         * 查询出所有的留言
         * */
        List<Message> messages1 = messageMapper.queryMessageAll(0);
        for (Message message:messages1) {
            //查询留言对应的用户信息
            List<Message> userAndMessage = messageMapper.queryMessage(message.getMessageid());
            selectChildMessage(userAndMessage);
            message.setReplyMessagesList(reposlyMessage);
            reposlyMessage = new ArrayList<>();
        }
        return JsonData.buildSuccess(messages1, Constants.NUM_SCUESS);
    }

    /**
     * 查询出子留言
     * @param childMessageList
     */
    private void selectChildMessage(List<Message> childMessageList){
        //判断该评论是否有一级子回复
        if(childMessageList .size() > 0){
            //循环找出子评论的id
            for(Message childMessage : childMessageList){
                childMessage.setParentMessage(messageMapper.selectMessageById(childMessage.getParentmessageid()));
                reposlyMessage.add(childMessage);
                //查询二级以及所有子集回复
                selectGrandchildMessage(childMessage.getMessageid());
            }
        }
    }

    /**
     * 循环迭代找出子集回复
     * @param childMessageId
     */
    private void selectGrandchildMessage(Integer childMessageId){
        //根据子一级评论的id找到子二级评论
        List<Message> replayMessageList = messageMapper.queryMessage(childMessageId);

        if(replayMessageList.size() > 0){
            for(Message replayMessage : replayMessageList){
                Integer replayMessageId = replayMessage.getMessageid();
                replayMessage.setParentMessage(messageMapper.selectMessageById(replayMessage.getParentmessageid()));
                reposlyMessage.add(replayMessage);
                //循环迭代找出子集回复
                selectGrandchildMessage(replayMessageId);
            }
        }
    }
}
