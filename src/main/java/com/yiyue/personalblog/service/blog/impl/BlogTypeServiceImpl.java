package com.yiyue.personalblog.service.blog.impl;

import com.yiyue.personalblog.entity.blog.domain.BlogType;
import com.yiyue.personalblog.entity.blog.example.BlogTypeExample;
import com.yiyue.personalblog.mapper.blog.BlogTypeMapper;
import com.yiyue.personalblog.service.blog.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: BlogTypeServiceImpl
 * @Author:TanLongYue
 * @Description
 * @Date Created in 2021/2/28 18:55
 * @Modified By
 */
@Service
public class BlogTypeServiceImpl implements BlogTypeService {

    @Autowired
    private BlogTypeMapper blogTypeMapper;

    @Override
    public long countByExample(BlogTypeExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(BlogTypeExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer typeid) {
        return 0;
    }

    @Override
    public int insert(BlogType record) {
        return 0;
    }

    @Override
    public int insertSelective(BlogType record) {
        return 0;
    }

    @Override
    public List<BlogType> selectByExample(BlogTypeExample example) {
        return null;
    }

    @Override
    public BlogType selectByPrimaryKey(Integer typeid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(BlogType record, BlogTypeExample example) {
        return 0;
    }

    @Override
    public int updateByExample(BlogType record, BlogTypeExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(BlogType record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BlogType record) {
        return 0;
    }
}
