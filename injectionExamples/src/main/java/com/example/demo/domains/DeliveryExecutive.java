package com.example.demo.domains;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class DeliveryExecutive {

	private long code;
	private String firstName;
	private double rating;
	private long mobileNumber;
	
	@Autowired
	private Environment env;
	
	
	public void init() {
		
		log.info("Init Method called");
		log.info(env.getActiveProfiles().toString());
	System.out.println(Arrays.asList(env.getDefaultProfiles().toString()));
	
	}
}
