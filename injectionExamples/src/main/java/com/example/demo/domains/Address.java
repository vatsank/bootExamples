package com.example.demo.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

	private String addressLine1;
	private String addressLine2;
	private String city;
	private long pincode;
	
}
