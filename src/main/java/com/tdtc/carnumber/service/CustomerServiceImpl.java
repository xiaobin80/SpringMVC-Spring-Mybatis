package com.tdtc.carnumber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tdtc.carnumber.dao.CustomerDao;
import com.tdtc.carnumber.pojo.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	public int insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return this.customerDao.insertCustomer(customer);
	}
	
	@Override
	public List getCustomerList() {
		// TODO Auto-generated method stub
		return this.customerDao.getCustomerList();
	}
	
	@Override
	public Customer getCustomerById(int customerID) {
		// TODO Auto-generated method stub
		return this.customerDao.getCustomerById(customerID);
	}
	
	@Override
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return this.customerDao.updateCustomer(customer);
	}
	
	@Override
	public int deleteCustomer(int customerID) {
		// TODO Auto-generated method stub
		return this.customerDao.deleteCustomer(customerID);
	}

}
