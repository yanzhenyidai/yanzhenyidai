package com.yanzhenyidai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @author tanzhen.frank
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.yanzhenyidai.mapper")
@EnableFeignClients
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class UpPlatformSystemServicerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpPlatformSystemServicerApplication.class, args);
    }

}
