package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DriverProfile {

	private long driverId;
	private String firstName;	
	private String lastName;
	private long phoneNumber;
	private double rating;
	private long tripCount;
	
}
