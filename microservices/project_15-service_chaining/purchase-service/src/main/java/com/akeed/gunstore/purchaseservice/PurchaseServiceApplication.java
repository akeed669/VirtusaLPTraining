package com.akeed.gunstore.purchaseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.akeed.gunstore.model.purchase")
public class PurchaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseServiceApplication.class, args);
	}

}
