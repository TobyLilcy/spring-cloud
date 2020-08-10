package com.lcy.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Toby.Li on 2020/8/10.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ApiZuulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiZuulServiceApplication.class, args);
    }
}
