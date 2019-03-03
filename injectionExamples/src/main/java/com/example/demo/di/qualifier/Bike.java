package com.example.demo.di.qualifier;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Component
public class Bike extends Vehicle {

	private String color;

	public Bike(String name, String manufacturer, String color) {
		super(name, manufacturer);
		this.color = color;
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
