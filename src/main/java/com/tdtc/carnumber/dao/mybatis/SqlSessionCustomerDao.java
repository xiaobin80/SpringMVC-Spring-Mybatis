package com.tdtc.carnumber.dao.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.dao.DataAccessException;

import com.tdtc.carnumber.dao.CustomerDao;
import com.tdtc.carnumber.pojo.Customer;

public class SqlSessionCustomerDao extends SqlSessionDaoSupport implements CustomerDao {

	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		// TODO Auto-generated method stub
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	
	@Override
	public int insertCustomer(Customer customer) throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlSession().insert("insertCustomer", customer);
	}
	
	@Override
	public List<Customer> getCustomerList() throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("getCustomerList");
	}
	
	@Override
	public Customer getCustomerById(int customerID) throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("getCustomerById", customerID);
	}

	@Override
	public int updateCustomer(Customer customer) throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlSession().update("updateCustomer", customer);
	}

	@Override
	public int deleteCustomer(int customerID) throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlSession().delete("delCustomerById", customerID);
	}

}
