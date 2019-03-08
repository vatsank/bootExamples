package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FindPartnerController {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private EurekaDiscoveryClient clientRef;	
	
	@GetMapping("/getDrivers")
	public String fetechPartner() {
		
		String baseURL = clientRef.getServices().get(0);
		
		System.out.println("==================="+baseURL);
		
	  String response = template.getForObject("http://partner-profile-service/getPartner/",String.class);

		return response;

	}
	
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		
		 return new RestTemplate();
	}
}
