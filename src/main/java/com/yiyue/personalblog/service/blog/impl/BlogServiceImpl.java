package com.yiyue.personalblog.service.blog.impl;

import com.yiyue.personalblog.entity.blog.domain.Blog;
import com.yiyue.personalblog.entity.blog.example.BlogExample;
import com.yiyue.personalblog.mapper.blog.BlogMapper;
import com.yiyue.personalblog.service.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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



    @Override
    public long countByExample(BlogExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(BlogExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer blogid) {
        return 0;
    }

    @Override
    public int insert(Blog record) {
        return 0;
    }

    @Override
    public int insertSelective(Blog record) {
        return 0;
    }

    @Override
    public List<Blog> selectByExample(BlogExample example) {
        return blogMapper.selectByExample(example);
    }

    @Override
    public Blog selectByPrimaryKey(Integer blogid) {
        return blogMapper.selectByPrimaryKey(blogid);
    }

    @Override
    public int updateByExampleSelective(Blog record, BlogExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Blog record, BlogExample example) {
        return blogMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Blog record) {
        return blogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Blog record) {
        return 0;
    }

    @Override
    public List<Blog> selectRecommend() {
        return blogMapper.selectRecommend();
    }

    @Override
    public List<Blog> selectPublished(Blog blogExample,String typeId) {
        return blogMapper.selectPublished(blogExample,typeId);
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
}
