package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.TripDetail;

@Controller
public class TripController {

	@Autowired
	TripDetail detail;
	
	@GetMapping("/")
	public String init() {
		
		return "index";
	}
	
	@ModelAttribute("location")
	public String[] loadPlaces()
	{      	return new String[]{"Bessy Beach","Mahabs","Mayajal"};   	}

	
	@GetMapping("/addTrip")
	public String initForm(Model model) {
		
		model.addAttribute("command",detail);
		return "addTripDetails";
	}
	
	
	@PostMapping("/addTrip")
	public String onSubmit(@ModelAttribute("data") TripDetail details) {
		System.out.println(details);
		return "success";
	}
	
}
