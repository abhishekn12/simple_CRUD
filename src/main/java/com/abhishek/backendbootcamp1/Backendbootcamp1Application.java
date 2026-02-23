package com.abhishek.backendbootcamp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.abhishek.backendbootcamp1.repository")
//@EntityScan(basePackages = "com.abhishek.backendbootcamp1")
public class Backendbootcamp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Backendbootcamp1Application.class, args);
	}

}
