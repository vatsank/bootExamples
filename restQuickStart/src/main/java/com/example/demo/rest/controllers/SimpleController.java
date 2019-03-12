package com.example.demo.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repos.CarRepository;
import com.example.demo.rest.model.Car;

import io.swagger.annotations.*;

@RestController
public class SimpleController {

	@Autowired
	private CarRepository repo;
	
	@ApiOperation(value = "View a list of Cars", response = List.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved list"),
        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })

	@GetMapping("/car")
	public List<Car> getCar() {
		return repo.findAll();
	}
	
    @ApiOperation(value = "Add a Car")
	@PostMapping("/addcar")
	public Car addCar(@ApiParam(value = "Car object store in database table", required = true)@RequestBody Car car) {
		
		return repo.save(car);
	}
}
