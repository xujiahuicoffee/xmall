package com.xmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(XUserApplication.class, args);
    }

}
