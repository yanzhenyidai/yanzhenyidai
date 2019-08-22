package com.yanzhenyidai;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author tanzhen.frank
 * @since 1.0.0
 */
@SpringCloudApplication
@EnableAuthorizationServer
public class UpGateWayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpGateWayServerApplication.class, args);
    }

}
