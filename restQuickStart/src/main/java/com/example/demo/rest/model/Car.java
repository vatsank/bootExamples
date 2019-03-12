package com.example.demo.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="springcars")
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
	
	private String carNumber;
	private String carDriverName;
	
	
	
}
