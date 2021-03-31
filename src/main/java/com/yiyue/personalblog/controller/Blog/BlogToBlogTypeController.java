package com.yiyue.personalblog.controller.Blog;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiyue.personalblog.constants.Constants;
import com.yiyue.personalblog.entity.blog.domain.Blog;
import com.yiyue.personalblog.entity.blog.domain.BlogType;
import com.yiyue.personalblog.entity.blog.example.BlogExample;
import com.yiyue.personalblog.entity.blog.example.BlogTypeExample;
import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.service.blog.BlogService;
import com.yiyue.personalblog.service.blog.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: BlogToBlogTypeController
 * @Author:TanLongYue
 * @Description 文章分类 与 文章类
 * @Date Created in 2021/3/25 19:21
 * @Modified By
 */
@RestController
@RequestMapping("/pub")
public class BlogToBlogTypeController {

    @Autowired
    private BlogTypeService blogTypeService;

    @Autowired
    private BlogService blogService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 查询分类类别
     * */
    @RequestMapping(value = "selectBlogTypeToCount",method = RequestMethod.GET)
    public JsonData selectBlogTypeToCount(){
        String articleClass = stringRedisTemplate.opsForValue().get(Constants.LATEST_ARTICLE_CLASSIFICATION);
        List<BlogType> blogTypesList;
        if(articleClass != null){
            blogTypesList = (List<BlogType>) JSONObject.parse(articleClass);
        }else{
            blogTypesList = blogTypeService.selectByExample(new BlogTypeExample());
            for (BlogType blogType:blogTypesList){
                blogType.setBlogCount(String.valueOf(blogService.findBlogCount(String.valueOf(blogType.getTypeid()))));
            }
            //存入Redis 并设置失效时间2400秒
            stringRedisTemplate.opsForValue().set(Constants.LATEST_ARTICLE_CLASSIFICATION,JSONObject.toJSONString(blogTypesList),2400, TimeUnit.SECONDS);
        }
        return JsonData.buildSuccess(blogTypesList,Constants.NUM_SCUESS);
    }

    /**
     * 分类点击查询
     * */
    @RequestMapping(value = "classifiedClickQuery",method = RequestMethod.GET)
    public JsonData classifiedClickQuery(Blog blog,String typeId){
        PageHelper.startPage(blog.getPageNum(),blog.getPageSize());
        List<Blog> lists  = blogService.selectPublished(blog,typeId);
        PageInfo<Blog> pageInfo = new PageInfo<>(lists);
        return JsonData.buildSuccess(pageInfo,Constants.NUM_SCUESS);
    }

    /**
     * 文章详情
     * */
    @RequestMapping(value = "blogDetailInfo",method = RequestMethod.POST)
    public JsonData blogDetailInfo(Blog blog){
        BlogExample blogExample = new BlogExample();
        BlogExample.Criteria criteria = blogExample.createCriteria();
        criteria.andBlogidEqualTo(blog.getBlogid());
        String articleDetail = stringRedisTemplate.opsForValue().get(Constants.LATEST_ARTICLE_DETAIL + blog.getBlogid());
        Blog blogs;
        if(articleDetail != null){
            Object parse = JSONObject.parse(articleDetail);
            return JsonData.buildSuccess(parse,Constants.NUM_SCUESS);
        }else{
            blogs = blogService.findArDetailInfo(blogExample);
            stringRedisTemplate.opsForValue().set(Constants.LATEST_ARTICLE_DETAIL+blog.getBlogid(),JSONObject.toJSONString(blogs),2400,TimeUnit.SECONDS);
            return JsonData.buildSuccess(blogs,Constants.NUM_SCUESS);
        }
    }

    /**
     * 文章浏览
     * */
    @RequestMapping(value = "addViews",method = RequestMethod.POST)
    public JsonData addViews(Blog blog){
        Blog blog1 = blogService.selectByPrimaryKey(blog.getBlogid());
        blog1.setViews(blog.getViews() + 1);
        int i = blogService.updateByPrimaryKeySelective(blog1);
        if(i > 0){
            return JsonData.buildSuccess(Constants.MSG_SUCCESS,Constants.NUM_SCUESS);
        }else{
            return JsonData.buildSuccess(Constants.MSG_ERROR,Constants.NUM_ERROR);
        }
    }
}
