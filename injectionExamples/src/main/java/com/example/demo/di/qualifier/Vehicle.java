package com.example.demo.di.qualifier;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public abstract class Vehicle {

    private String name;
    private String manufacturer;
    
   

}
