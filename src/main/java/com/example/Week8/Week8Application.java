package com.example.Week8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Week8Application {

	public static void main(String[] args) {
		SpringApplication.run(Week8Application.class, args);
	}

}
