package com.example.demo.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CarClient;

@RestController

public class MyFeignController {

	 @Autowired
	  CarClient client;
	  
	   @GetMapping(value = "/mybookings")
	    ResponseEntity<List> getCars() {
	        return ResponseEntity.ok(client.getAllCars());
	    }
}
