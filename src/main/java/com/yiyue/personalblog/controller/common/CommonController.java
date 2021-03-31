package com.yiyue.personalblog.controller.common;

import com.yiyue.personalblog.constants.Constants;
import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.service.blog.BlogService;
import com.yiyue.personalblog.service.blog.BlogTypeService;
import com.yiyue.personalblog.service.message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: CommonController
 * @Author:TanLongYue
 * @Description 公共用类
 * @Date Created in 2021/3/25 21:26
 * @Modified By
 */
@RestController
@RequestMapping("/pub")
public class CommonController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private BlogTypeService blogTypeService;

    @Autowired
    private MessageService messageService;

    /**
     * 查询留言总条数
     * */
    @RequestMapping(value = "selectCount",method = RequestMethod.GET)
    public JsonData selectCount(){
        return JsonData.buildSuccess(messageService.selectCount(), Constants.NUM_SCUESS);
    }

    /**
     * 查询文章总数
     * */
    @RequestMapping(value = "blogCount",method = RequestMethod.GET)
    public JsonData blogCount(){
        Integer blogCount = blogService.findBlogCount("");
        return JsonData.buildSuccess(blogCount,Constants.NUM_SCUESS);
    }

    /**
     * 查询访问总数
     * */
    @RequestMapping(value = "viewsCount",method = RequestMethod.GET)
    public JsonData viewsCount(){
       return JsonData.buildSuccess( blogService.findViewsCount(),Constants.NUM_SCUESS);
    }
}
