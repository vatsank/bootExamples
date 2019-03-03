package com.example.demo.di.qualifier;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString
@Component
public class Car extends Vehicle {
	
	private String engineType;

    public Car(String name, String manufacturer, String engineType) {
		super(name, manufacturer);
		this.engineType = engineType;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


    
}
