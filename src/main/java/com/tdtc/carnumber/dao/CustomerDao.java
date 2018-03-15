package com.tdtc.carnumber.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.tdtc.carnumber.pojo.Customer;

public interface CustomerDao {
	int insertCustomer(Customer customer) throws DataAccessException;
	Customer getCustomerById(int customerID) throws DataAccessException;
	List getCustomerList() throws DataAccessException;
	int updateCustomer(Customer customer) throws DataAccessException;
	int deleteCustomer(int customerID) throws DataAccessException;
}
