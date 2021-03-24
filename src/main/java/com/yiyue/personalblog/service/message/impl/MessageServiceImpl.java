package com.yiyue.personalblog.service.message.impl;


import com.yiyue.personalblog.entity.message.domain.Message;
import com.yiyue.personalblog.entity.message.example.MessageExample;
import com.yiyue.personalblog.mapper.message.MessageMapper;
import com.yiyue.personalblog.service.message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public long countByExample(MessageExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(MessageExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer messageid) {
        return 0;
    }

    @Override
    public int insert(Message record) {
        return 0;
    }

    @Override
    public int insertSelective(Message record) {
        return 0;
    }

    @Override
    public List<Message> selectByExample(MessageExample example) {
        return messageMapper.selectByExample(example);
    }

    @Override
    public Message selectByPrimaryKey(Integer messageid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Message record, MessageExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Message record, MessageExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Message record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Message record) {
        return 0;
    }

    @Override
    public List<Message> queryMessage() {
        return messageMapper.queryMessage();
    }
}
