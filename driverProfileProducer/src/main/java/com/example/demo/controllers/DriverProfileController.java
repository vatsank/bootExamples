package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DriverProfile;

@RestController
public class DriverProfileController {

	
	@GetMapping("/getPartner")
	public String getDriverProfile() {
		
		
          return  new DriverProfile(101,"Ramesh","Reddy", 847477279L, 4.2, 899).toString();
          
          
	}
}
