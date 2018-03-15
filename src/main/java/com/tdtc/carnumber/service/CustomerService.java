package com.tdtc.carnumber.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tdtc.carnumber.pojo.Customer;

@Service
public interface CustomerService {
	
	int insertCustomer(Customer customer);
	List getCustomerList();
	Customer getCustomerById(int customerID);
	int updateCustomer(Customer customer);
	int deleteCustomer(int customerID); 
}
