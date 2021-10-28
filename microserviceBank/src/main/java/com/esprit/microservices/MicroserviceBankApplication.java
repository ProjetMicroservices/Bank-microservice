package com.esprit.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MicroserviceBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBankApplication.class, args);
	}

}
