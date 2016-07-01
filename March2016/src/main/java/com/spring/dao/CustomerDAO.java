package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.model.Customer;

public class CustomerDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addCustomer(Customer customer) {

	String sql = "INSERT INTO CUSTOMERS VALUES(?,?,?,?,?,?)";

	Object args[] = new Object[] { customer.getName(), customer.getAge(),

	customer.getSsn(), customer.getState(), customer.getZip(),

	customer.getCountry() };

	jdbcTemplate.update(sql, args);
	}
}
