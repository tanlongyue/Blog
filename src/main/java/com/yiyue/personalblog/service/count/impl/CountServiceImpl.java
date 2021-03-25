package com.yiyue.personalblog.service.count.impl;

import com.yiyue.personalblog.entity.count.domain.Count;
import com.yiyue.personalblog.entity.count.example.CountExample;
import com.yiyue.personalblog.mapper.count.CountMapper;
import com.yiyue.personalblog.service.count.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: CountServiceImpl
 * @Author:TanLongYue
 * @Description 访问总数
 * @Date Created in 2021/3/25 22:41
 * @Modified By
 */
@Service
public class CountServiceImpl implements CountService {

    @Autowired
    private CountMapper countMapper;

    @Override
    public long countByExample(CountExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CountExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Count record) {
        return 0;
    }

    @Override
    public int insertSelective(Count record) {
        return 0;
    }

    @Override
    public List<Count> selectByExample(CountExample example) {
        return null;
    }

    @Override
    public Count selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Count record, CountExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Count record, CountExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Count record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Count record) {
        return 0;
    }
}
