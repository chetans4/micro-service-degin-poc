package com.example.userservicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceFeignApplication.class, args);
	}

}
