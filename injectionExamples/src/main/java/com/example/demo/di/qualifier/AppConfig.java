package com.example.demo.di.qualifier;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.example.demo.di.qualifier")
public class AppConfig {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        
		VechicleManager bean = applicationContext.getBean(VechicleManager.class);
		
		  bean.getVehicles();
      
        applicationContext.close();
	}
	
	@Bean
	@AutoQualifier
	public Car getMercedes() {
		return new Car("E280", "Mercedes", "Diesel");
	}

	@Bean
	@AutoQualifier
	public Car getMaruti() {
		return new Car("Zxi", "Celerio", "petroll");
	}
	
	@Bean
	@AutoQualifier
	public Bike geBajaj() {
		return new Bike("M5", "BMW", "blue");
	}

}
