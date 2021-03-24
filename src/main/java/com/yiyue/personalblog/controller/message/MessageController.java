package com.yiyue.personalblog.controller.message;

import com.yiyue.personalblog.constants.Constants;
import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.entity.message.domain.Message;
import com.yiyue.personalblog.entity.message.example.MessageExample;
import com.yiyue.personalblog.service.message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: MessageController
 * @Author:TanLongYue
 * @Description 用户可进行留言操作。
 * @Date Created in 2021/3/16 21:04
 * @Modified By
 */
@RestController
@RequestMapping("/authc")
public class MessageController {

    @Autowired
    private MessageService messageService;

    /**
     * 查询所有留言
     * */
    @RequestMapping("queryMessageAll")
    public JsonData queryMessageAll(){
        MessageExample messageExample =  new MessageExample();
        /**
         * 查询出所有的留言
         * */

        List<Message> messages = messageService.queryMessage();
        return JsonData.buildSuccess(messages,Constants.NUM_SCUESS);
    }
}
