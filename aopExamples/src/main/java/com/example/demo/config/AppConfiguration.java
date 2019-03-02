package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.ConverterService;

@Configuration
public class AppConfiguration {

	
	@Bean
	public ConverterService converterService() {
		
		  return new ConverterService();
	}
}
