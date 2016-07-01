package com.two95.mar16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dao.CustomerDAO;
import com.spring.model.Customer;

@Controller
public class Reciever {
	@Autowired
	private CustomerDAO customerDao;
@RequestMapping("/customer")
public String customerRegistration(){
	return "customer";
}
@RequestMapping(value = "/customerRegistration" , method = RequestMethod.POST)
public String insertCustomerDetails(@ModelAttribute("customer") Customer customer){
	customerDao.addCustomer(customer);
	return "customerSuccess";
}
}
