package com.example.imageflowdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ImageflowDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageflowDiscoveryApplication.class, args);
	}

}
