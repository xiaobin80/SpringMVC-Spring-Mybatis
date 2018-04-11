package com.tdtc.carnumber.security;

import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tdtc.carnumber.pojo.RoleTypes;
import com.tdtc.carnumber.pojo.User;
import com.tdtc.carnumber.service.LoginService;

@Service("userDetailService")
public class CustomUserDetailsService implements UserDetailsService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private LoginService loginService;
	
	@Override
	public UserDetails loadUserByUsername(String ssoId) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = loginService.getUserBySsoId(ssoId);
		
		logger.info(user.getPassword());
		
		return new org.springframework.security.core.userdetails.User(
				ssoId, 
				user.getPassword(), 
				true, //user.getState().equals("Active"),
				true, 
				true, 
				true, 
				getAuthorities(user));
	}
	
	private Collection<SimpleGrantedAuthority> getAuthorities(User user) {
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		
		for (RoleTypes role : user.getRoles()) {
			authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
		}
		return authorities;
	}

}
