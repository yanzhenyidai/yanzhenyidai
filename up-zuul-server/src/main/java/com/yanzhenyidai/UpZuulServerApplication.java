package com.yanzhenyidai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @author tanzhen.frank
 * @since 1.0.0
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@EnableOAuth2Sso
public class UpZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpZuulServerApplication.class, args);
    }
}
