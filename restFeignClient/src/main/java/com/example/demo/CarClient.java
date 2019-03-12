package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.rest.model.Car;

@FeignClient(name="data", url="http://localhost:8080/car")
public interface CarClient {

		@GetMapping
	    List<Car> getAllCars();

	

}
