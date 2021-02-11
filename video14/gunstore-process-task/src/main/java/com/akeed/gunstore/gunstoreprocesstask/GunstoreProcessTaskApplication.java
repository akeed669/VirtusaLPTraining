package com.akeed.gunstore.gunstoreprocesstask;

import com.akeed.gunstore.gunstoreprocesstask.service.SaleProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class GunstoreProcessTaskApplication {

	@Bean
	SaleProcessTaskRunner getSaleProcessTaskRunner() {
		return new SaleProcessTaskRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(GunstoreProcessTaskApplication.class, args);
	}

}
