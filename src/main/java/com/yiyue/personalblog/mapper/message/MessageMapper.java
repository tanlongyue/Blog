package com.yiyue.personalblog.mapper.message;

import com.yiyue.personalblog.entity.message.domain.Message;
import com.yiyue.personalblog.entity.message.example.MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
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
    List<Message> queryMessage(Integer parentId);

    /**
     * 查询总计数留言
     * */
    Integer selectCount();

    Message selectMessageById(Integer messageId);

    List<Message> selectReplayTwoList(Integer childMessageId);

    List<Message> queryMessageAll(Integer Number);
}