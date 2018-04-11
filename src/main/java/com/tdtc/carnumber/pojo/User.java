package com.tdtc.carnumber.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String ssoId;
	private String password;
	private Set<RoleTypes> roles = new HashSet<RoleTypes>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSsoId() {
		return ssoId;
	}
	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Set<RoleTypes> getRoles() {
		return roles;
	}
	
	public void setRoles(Set<RoleTypes> roles) {
		this.roles = roles;
	}
}
