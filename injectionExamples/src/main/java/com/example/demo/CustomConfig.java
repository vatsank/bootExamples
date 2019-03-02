package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

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
    @Order(2)

	public FoodItem italian() {
		
		return new FoodItem(103,"Pasta","lunch","italian",150.00);
	}
	
	@Bean
    @Order(3)

	public FoodItem chinese() {
		
		return new FoodItem(104,"Noodles","allday","chinese",75.00);
	}
	
	@Bean
     @Order(1)
	public FoodItem mexican() {
		
		return new FoodItem(105,"panCake","breakfast","mexican",140);
	}
	
	@Bean
	public DiscountService discountService() {
		
		  return new DiscountService() {
			
			@Override
			protected DiscountNotification getDiscount(String month) {
				return new DiscountNotification(month);
			}
		};
	}
}
