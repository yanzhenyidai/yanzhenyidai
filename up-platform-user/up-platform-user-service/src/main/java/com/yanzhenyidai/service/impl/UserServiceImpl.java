package com.yanzhenyidai.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yanzhenyidai.domain.User;
import com.yanzhenyidai.facade.UserFacade;
import com.yanzhenyidai.mapper.UserMapper;
import com.yanzhenyidai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tanzhen.frank
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService, UserFacade {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByName(String name) {

        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
        wrapper.eq(User::getName, name);

        return userMapper.selectOne(wrapper);
    }
}
