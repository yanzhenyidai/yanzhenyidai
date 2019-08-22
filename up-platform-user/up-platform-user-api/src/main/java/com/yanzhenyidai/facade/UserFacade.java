package com.yanzhenyidai.facade;

import com.yanzhenyidai.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 服务类
 *
 * @author tanzhen.frank
 * @since 1.0.0
 */
@FeignClient("up-platform-user-service")
public interface UserFacade {

    @RequestMapping(value = "/queryByName", method = RequestMethod.GET)
    public User queryByName(String name);
}
