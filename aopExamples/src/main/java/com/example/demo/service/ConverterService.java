package com.example.demo.service;

import com.example.demo.utils.LogExecutionTime;

public class ConverterService {

	@LogExecutionTime
	public double dollorToRupees(double dlrAmount) throws InterruptedException {
		
		Thread.sleep(200);
		
		return dlrAmount * 0.65;
	}
}
