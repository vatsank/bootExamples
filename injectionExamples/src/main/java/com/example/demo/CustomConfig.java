package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domains.Address;
import com.example.demo.domains.Catalog;
import com.example.demo.domains.FoodItem;

@Configuration
public class CustomConfig {

	@Bean()
	public Catalog catalog() {
		return new Catalog(101,"Classical Menu",address());
	}
	
	@Bean
	public Address address() {
		
		return new Address("Gandhi Street","behru Nagar","chennai",600040);
	}
	
	@Bean
	public FoodItem italian() {
		
		return new FoodItem(103,"Pasta","lunch","italian",150.00);
	}
	
	@Bean
	public FoodItem chinese() {
		
		return new FoodItem(104,"Noodles","allday","chinese",75.00);
	}
	
	@Bean
	public FoodItem mexican() {
		
		return new FoodItem(105,"panCake","breakfast","mexican",140);
	}
}
