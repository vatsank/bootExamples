package com.example.demo;

import org.springframework.context.annotation.Scope;


@Scope("prototype" )
public  class DiscountNotification {

	private String month;
	
	
	public DiscountNotification(String month) {
		super();
		this.month = month;
	}


	public double showDiscount() {
				if(month.equals("april")) {
				        return 0.50;
		      	} else {
			      	return 0.10;
			 }
	}
}
