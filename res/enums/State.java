package com.example.model.enums;

public enum State {
	ACTIVE("Active"),
	INACTIVE("Inactive"),
	DELETED("Deleted"),
	LOCKED("Locked");
	
	private String state;
	
	private State(final String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
}
