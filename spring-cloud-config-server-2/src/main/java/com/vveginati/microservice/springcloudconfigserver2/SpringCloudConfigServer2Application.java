package com.vveginati.microservice.springcloudconfigserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServer2Application.class, args);
	}

}
