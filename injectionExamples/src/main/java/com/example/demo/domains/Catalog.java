package com.example.demo.domains;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Catalog {

	private long code;
	private String catalogName;
	private Address address;
	
	
	@Autowired
	private List<FoodItem> itemList;

	public Catalog(long code, String catalogName, Address address) {
		super();
		this.code = code;
		this.catalogName = catalogName;
		this.address = address;
	}

	
	
}
