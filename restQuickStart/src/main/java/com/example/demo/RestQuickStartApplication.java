package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.repos.CarRepository;
import com.example.demo.rest.model.Car;

@SpringBootApplication
public class RestQuickStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestQuickStartApplication.class, args);
	}

	@Bean
	public Car smallcar() {
		
		return new Car(2,"tn22ak1291","Ramesh");
		
	}
	
	@Bean
	public Car luxurycar() {
		
		return new Car(1,"tn22ak1291","Ramesh");
		
	}
	
    @Bean
    ApplicationRunner init(CarRepository repository) {

    	return  (args)->{
    		
    		repository.save(smallcar());
    		repository.save(luxurycar());

    		
    		  
    	};
    	     }
}
