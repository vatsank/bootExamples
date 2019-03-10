package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.daos.CustomerDAOImpl;
import com.example.demo.model.Customer;

@SpringBootApplication
public class BootJdbcTemplateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(BootJdbcTemplateApplication.class, args);
	
		  CustomerDAOImpl dao = ctx.getBean(CustomerDAOImpl.class);
		  
	
		  List<Customer> custList = dao.findAll();
		  
		  custList.forEach(System.out::println);
		  
	}

}
