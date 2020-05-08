package com.supplier.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User {
	private String userName;
	
	
	
	public User() {
	}
	
	@PostConstruct
	private void init() {
		System.out.println("Verifying Resources");
	}

	@PreDestroy
	private void shutdown() {
		System.out.println("Shutdown All Resources");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
