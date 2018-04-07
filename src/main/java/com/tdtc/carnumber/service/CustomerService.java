package com.tdtc.carnumber.service;

import java.util.List;

import com.tdtc.carnumber.pojo.Customer;

public interface CustomerService {
	
	int insertCustomer(Customer customer);
	List<Customer> getCustomerList();
	Customer getCustomerById(int customerID);
	int updateCustomer(Customer customer);
	int deleteCustomer(int customerID); 
}
