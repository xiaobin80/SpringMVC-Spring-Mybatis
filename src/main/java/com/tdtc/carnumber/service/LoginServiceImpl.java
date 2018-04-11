package com.tdtc.carnumber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdtc.carnumber.dao.LoginDao;
import com.tdtc.carnumber.pojo.User;

@Service("loginSerice")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public User getUserBySsoId(String ssoId) {
		// TODO Auto-generated method stub
		return loginDao.getUserBySsoId(ssoId);
	}

}
