package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domains.Catalog;
import com.example.demo.domains.FoodItem;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class InjectionExamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(InjectionExamplesApplication.class, args);
		
		  FoodItem idly = ctx.getBean("first",FoodItem.class);
		  
		  idly.setItemCode(101);
		  idly.setItemName("Idly");
		  idly.setItemType("BreakFast");
		  idly.setCategory("SouthIndian");
		  idly.setUnitPrice(40.00);
		  
		log.info(idly.toString());
		
		Catalog southFood = ctx.getBean(Catalog.class);
		 
		log.info(southFood.toString());
		System.out.println(southFood.getItemList());
		
		 
	}

}
