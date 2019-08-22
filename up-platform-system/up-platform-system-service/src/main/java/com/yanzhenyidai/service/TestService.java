package com.yanzhenyidai.service;

import com.yanzhenyidai.domain.Test;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author tanzhen.frank
 * @since 2019-04-12
 */
public interface TestService {

    public List<Test> query();

    public Test queryById(Long id);
}
