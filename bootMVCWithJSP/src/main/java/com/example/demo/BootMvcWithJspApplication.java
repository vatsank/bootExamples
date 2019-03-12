package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.TripDetail;

@SpringBootApplication
public class BootMvcWithJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcWithJspApplication.class, args);
	}

	
	@Bean
	public TripDetail detail() {
		
		return new TripDetail();
	}
}
