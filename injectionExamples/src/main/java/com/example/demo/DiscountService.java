package com.example.demo;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;

@Scope("singleton")
public abstract class DiscountService {

	    @Lookup
        protected abstract DiscountNotification getDiscount(String month);
	    
	    public void print() {
	    	
	    	System.out.println("Hello");
	    }

}
