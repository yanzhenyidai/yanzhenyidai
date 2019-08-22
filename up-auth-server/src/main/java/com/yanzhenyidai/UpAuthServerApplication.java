package com.yanzhenyidai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author tanzhen.frank
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableFeignClients
public class UpAuthServerApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(UpAuthServerApplication.class, args);
    }
}
