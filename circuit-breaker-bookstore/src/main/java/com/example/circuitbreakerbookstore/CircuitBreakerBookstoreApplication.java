package com.example.circuitbreakerbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CircuitBreakerBookstoreApplication {

	/*service provider*/
	@RequestMapping(value="/recommended")
	public String readingList(){
		return "Spring in action (Manning), cloud Native Java, Learning Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerBookstoreApplication.class, args);
	}

}
