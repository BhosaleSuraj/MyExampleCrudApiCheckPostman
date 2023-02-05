package com.project.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MyProjectRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectRestApplication.class, args);
		
		System.out.println("my rest project is running");
		
		
	}

}
