package com.abhishek.springmvcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.abhishek.springmvcboot.repository")
public class DemoMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMongoApplication.class, args);
	}

}
