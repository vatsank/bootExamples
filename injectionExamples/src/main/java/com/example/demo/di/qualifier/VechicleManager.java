package com.example.demo.di.qualifier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VechicleManager {

	
    public VechicleManager() {
		super();
	}

	@Autowired
    @AutoQualifier
    private List<Vehicle> vehicles;

    public void getVehicles(){
    	
    	vehicles.forEach(System.out::println);
    }
}
