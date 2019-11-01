package com.arneam.numeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NumEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumEurekaApplication.class, args);
	}

}
