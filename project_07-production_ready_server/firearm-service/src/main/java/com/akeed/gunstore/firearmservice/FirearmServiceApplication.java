package com.akeed.gunstore.firearmservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.akeed.gunstore.commons.model")
public class FirearmServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirearmServiceApplication.class, args);
	}

}
