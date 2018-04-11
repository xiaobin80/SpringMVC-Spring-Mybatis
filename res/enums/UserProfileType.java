package com.example.model.enums;

public enum UserProfileType {
	USER("USER"),
	DBA("DBA"),
	ADMIN("ADMIN");
	
	private String type;
	
	private UserProfileType(String type) {
		this.type = type;
	}
	
	public String getUserProfileType() {
		return this.type;
	}
}
