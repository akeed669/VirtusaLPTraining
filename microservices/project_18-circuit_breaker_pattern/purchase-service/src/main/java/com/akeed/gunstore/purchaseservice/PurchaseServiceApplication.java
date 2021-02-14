package com.akeed.gunstore.purchaseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.akeed.gunstore.model.purchase")
@EnableEurekaClient
@EnableCircuitBreaker
public class PurchaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseServiceApplication.class, args);
	}

}
