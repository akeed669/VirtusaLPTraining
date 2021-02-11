package com.akeed.gunstore.gunstoreui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class GunstoreUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GunstoreUiApplication.class, args);
	}

}
