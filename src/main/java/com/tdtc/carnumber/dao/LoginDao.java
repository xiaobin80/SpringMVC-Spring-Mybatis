package com.tdtc.carnumber.dao;

import org.springframework.dao.DataAccessException;

import com.tdtc.carnumber.pojo.User;

public interface LoginDao {
	User getUserBySsoId(String ssoId) throws DataAccessException;
}
