package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.ConverterService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AopExamplesApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(AopExamplesApplication.class, args);
		
		ConverterService service = ctx.getBean(ConverterService.class);
		
		try {
			log.info("Amount :="+service.dollorToRupees(450));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ctx.close();
	
	}

}
