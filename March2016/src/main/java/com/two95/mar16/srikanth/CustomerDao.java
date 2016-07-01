package com.two95.mar16.srikanth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDao {
@Autowired
private JdbcTemplate jdbcTemplate;
 public void insertCustDetails(CustDetails custdetails){
	 String sql ="insert into customerreg values(?,?,?,?,?)";
	 jdbcTemplate.update(sql,new Object[]{custdetails.getName(),custdetails.getMobile(),custdetails.getEmail(),custdetails.getDa(),custdetails.getSex()});
	 
 }

}
