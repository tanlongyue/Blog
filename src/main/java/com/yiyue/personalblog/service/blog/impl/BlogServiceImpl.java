package com.yiyue.personalblog.service.blog.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiyue.personalblog.constants.Constants;
import com.yiyue.personalblog.entity.blog.domain.Blog;
import com.yiyue.personalblog.entity.blog.domain.BlogType;
import com.yiyue.personalblog.entity.blog.example.BlogExample;
import com.yiyue.personalblog.entity.blog.example.BlogTypeExample;
import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.mapper.blog.BlogMapper;
import com.yiyue.personalblog.mapper.blog.BlogTypeMapper;
import com.yiyue.personalblog.service.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: BlogServiceImpl
 * @Author:TanLongYue
 * @Description
 * @Date Created in 2021/2/28 18:52
 * @Modified By
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private BlogTypeMapper blogTypeMapper;


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public List<Blog> selectRecommend() {
        return blogMapper.selectRecommend();
    }

    @Override
    public List<Blog> selectPublished(Blog blog, String typeId) {
        return null;
    }

    @Override
    public Integer findBlogCount(String typeId) {
        return blogMapper.findBlogCount(typeId);
    }

    @Override
    public Blog findArDetailInfo(BlogExample example) {
        return blogMapper.findArDetailInfo(example);
    }

    @Override
    public Integer findViewsCount() {
        return blogMapper.findViewsCount();
    }

    @Override
    public JsonData selectPublished(Blog blog) {
        PageHelper.startPage(blog.getPageNum(),blog.getPageSize());
        List<Blog> lists  = blogMapper.selectPublished(blog,"");
        PageInfo<Blog> pageInfo = new PageInfo<>(lists);
        return JsonData.buildSuccess(pageInfo, Constants.NUM_SCUESS);
    }

    @Override
    public JsonData addViews(Blog blog) {
        Blog blog1 = blogMapper.selectByPrimaryKey(blog.getBlogid());
        blog1.setViews(blog1.getViews() + 1);
        int i = blogMapper.updateByPrimaryKeySelective(blog1);
        if(i > 0){
            return JsonData.buildSuccess(Constants.MSG_SUCCESS,Constants.NUM_SCUESS);
        }else{
            return JsonData.buildSuccess(Constants.MSG_ERROR,Constants.NUM_ERROR);
        }
    }

    @Override
    public JsonData blogDetailInfo(Blog blog) {
        BlogExample blogExample = new BlogExample();
        BlogExample.Criteria criteria = blogExample.createCriteria();
        criteria.andBlogidEqualTo(blog.getBlogid());
        String articleDetail = stringRedisTemplate.opsForValue().get(Constants.LATEST_ARTICLE_DETAIL + blog.getBlogid());
        Blog blogs;
        if(articleDetail != null){
            Object parse = JSONObject.parse(articleDetail);
            return JsonData.buildSuccess(parse,Constants.NUM_SCUESS);
        }else{
            blogs = blogMapper.findArDetailInfo(blogExample);
            stringRedisTemplate.opsForValue().set(Constants.LATEST_ARTICLE_DETAIL+blog.getBlogid(),JSONObject.toJSONString(blogs),2400, TimeUnit.SECONDS);
            return JsonData.buildSuccess(blogs,Constants.NUM_SCUESS);
        }
    }

    @Override
    public JsonData classifiedClickQuery(Blog blog, String typeId) {
        PageHelper.startPage(blog.getPageNum(),blog.getPageSize());
        List<Blog> lists  = blogMapper.selectPublished(blog,typeId);
        PageInfo<Blog> pageInfo = new PageInfo<>(lists);
        return JsonData.buildSuccess(pageInfo,Constants.NUM_SCUESS);
    }

    @Override
    public JsonData selectBlogTypeToCount() {
        String articleClass = stringRedisTemplate.opsForValue().get(Constants.LATEST_ARTICLE_CLASSIFICATION);
        List<BlogType> blogTypesList;
        if(articleClass != null){
            blogTypesList = (List<BlogType>) JSONObject.parse(articleClass);
        }else{
            blogTypesList = blogTypeMapper.selectByExample(new BlogTypeExample());
            for (BlogType blogType:blogTypesList){
                blogType.setBlogCount(String.valueOf(blogMapper.findBlogCount(String.valueOf(blogType.getTypeid()))));
            }
            //存入Redis 并设置失效时间2400秒
            stringRedisTemplate.opsForValue().set(Constants.LATEST_ARTICLE_CLASSIFICATION,JSONObject.toJSONString(blogTypesList),2400, TimeUnit.SECONDS);
        }
        return JsonData.buildSuccess(blogTypesList,Constants.NUM_SCUESS);
    }
}
