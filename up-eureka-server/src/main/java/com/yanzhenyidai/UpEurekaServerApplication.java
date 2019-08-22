package com.yanzhenyidai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka启动类
 *
 * @author tanzhen.frank
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class UpEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpEurekaServerApplication.class, args);
    }
}
