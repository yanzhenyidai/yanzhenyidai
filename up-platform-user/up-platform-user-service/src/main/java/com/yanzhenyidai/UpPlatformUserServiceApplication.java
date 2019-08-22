package com.yanzhenyidai;

import com.yanzhenyidai.domain.Test;
import com.yanzhenyidai.facade.TestFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author frank
 * @version 1.0
 * @date 2019-04-13 20:00
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class UpPlatformUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpPlatformUserServiceApplication.class, args);
    }

    @Autowired
    private TestFacade testFacade;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Test> query() {
        return testFacade.query();
    }
}
