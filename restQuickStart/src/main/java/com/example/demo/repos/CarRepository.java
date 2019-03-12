package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.rest.model.Car;

public interface CarRepository extends JpaRepository<Car, String> {

}
