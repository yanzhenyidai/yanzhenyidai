package com.yanzhenyidai.service.impl;

import com.yanzhenyidai.domain.Test;
import com.yanzhenyidai.facade.TestFacade;
import com.yanzhenyidai.mapper.TestMapper;
import com.yanzhenyidai.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tanzhen.frank
 * @since 1.0.0
 */
@Service
public class TestServiceImpl implements TestService, TestFacade {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> query() {
        return testMapper.selectList(null);
    }

    @Override
    public Test queryById(Long id) {
        return testMapper.selectById(id);
    }
}
