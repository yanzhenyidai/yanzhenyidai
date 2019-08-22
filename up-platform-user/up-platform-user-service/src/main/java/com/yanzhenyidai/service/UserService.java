package com.yanzhenyidai.service;

import com.yanzhenyidai.domain.User;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author tanzhen.frank
 * @since 2019-05-06
 */
@Service
public interface UserService {

    public User queryByName(String name);
}
