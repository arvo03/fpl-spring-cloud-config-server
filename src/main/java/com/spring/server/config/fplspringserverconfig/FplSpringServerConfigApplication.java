package com.spring.server.config.fplspringserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FplSpringServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FplSpringServerConfigApplication.class, args);
	}

}
