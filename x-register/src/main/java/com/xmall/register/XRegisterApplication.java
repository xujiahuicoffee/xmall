package com.xmall.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class XRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(XRegisterApplication.class, args);
	}

}
