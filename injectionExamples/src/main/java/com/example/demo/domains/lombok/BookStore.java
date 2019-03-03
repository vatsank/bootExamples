package com.example.demo.domains.lombok;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BookStore {

	private final String author;

	private  final AuthorRatingService service;
	
	@Autowired
	public BookStore(AuthorRatingService service) {
		this("Ramesh" ,service);
		
	}

	public void printRating() {
		
		System.out.println(service.getRating(author));
	}





}
