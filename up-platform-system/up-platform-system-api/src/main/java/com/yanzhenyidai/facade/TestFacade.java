package com.yanzhenyidai.facade;

import com.yanzhenyidai.domain.Test;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author tanzhen.frank
 * @since 2019-04-12
 */
@FeignClient(value = "up-platform-system-service")
public interface TestFacade {

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Test> query();
}
