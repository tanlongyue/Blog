package com.yiyue.personalblog.service.message;

import com.yiyue.personalblog.entity.message.domain.Message;
import com.yiyue.personalblog.entity.message.example.MessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageService {

    long countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(Integer messageid);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(Integer messageid);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    /**
     * 查询全部留言和对应的用户信息
     * */
    List<Message> queryMessage();
}
