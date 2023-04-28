package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HeroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroServiceApplication.class, args);
		System.out.println("Running...........");
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
