package com.sample.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApigeeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigeeTestApplication.class, args);
	}
	
	@GetMapping("/")
	public String message() {
		return "Message";
	}

}
