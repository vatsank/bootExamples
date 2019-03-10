package com.example.demo.daos;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
import com.training.ifaces.Crud;

@Repository
public class CustomerDAOImpl implements Crud<Customer> {

    @Autowired
    private JdbcTemplate template;

	@Override
	public List<Customer> findAll() {
        List < Customer > customers = new ArrayList <> ();

        List < Map < String, Object >> rows = template.queryForList("SELECT * FROM CUSTOMER");

        for (Map < String, Object > row: rows) {
            Customer customer = new Customer();

            customer.setId((long) row.get("Id"));
            customer.setFirst_name((String) row.get("first_name"));
            customer.setLast_name((String) row.get("last_name"));

            customers.add(customer);
        }

        return customers;
	}

	
}
