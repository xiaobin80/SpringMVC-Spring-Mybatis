package com.tdtc.carnumber.service;

import com.tdtc.carnumber.pojo.User;

public interface LoginService {
	User getUserBySsoId(String ssoId);
}
