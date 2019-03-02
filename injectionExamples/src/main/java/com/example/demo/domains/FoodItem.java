package com.example.demo.domains;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component(value="first")
public class FoodItem {

	private long itemCode;
	private String itemName;
	private String itemType;
	private String category;
	private double unitPrice;
	
}
