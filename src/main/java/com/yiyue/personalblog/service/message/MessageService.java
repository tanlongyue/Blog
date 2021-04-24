package com.yiyue.personalblog.service.message;

import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.entity.message.domain.Message;
import com.yiyue.personalblog.entity.message.example.MessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageService {


    Integer selectCount();

    JsonData queryMessageAll();
}
