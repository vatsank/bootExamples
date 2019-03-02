package com.example.demo.advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;


@Aspect
@Configuration
@Slf4j
public class BeforeAdvice {
	
	
    @Before("execution(* com.example.demo.service.*.*(..))")
    public void before(JoinPoint joinPoint) {

    	log.info(" Check for user access ");
        log.info(" Allowed execution for {}", joinPoint);
    }


}
