package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UrekaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrekaDiscoveryServerApplication.class, args);
	}

}
