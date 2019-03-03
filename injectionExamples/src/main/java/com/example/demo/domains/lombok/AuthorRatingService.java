package com.example.demo.domains.lombok;

import org.springframework.stereotype.Component;

@Component
public class AuthorRatingService {

	public double getRating(String author) {
		
		 return 4.5;
	}
}
