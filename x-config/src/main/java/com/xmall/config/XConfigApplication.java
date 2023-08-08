package com.xmall.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class XConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(XConfigApplication.class, args);
	}

}
