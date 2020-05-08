package com.supplier.domain;

public class User {
	
	public void defaultInIt() {
		System.out.println("default initlization of beans ");
	}
	
	private Long id;
	private String userName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public void defaultCleanUp() {
		System.out.println("default cleanUp of beans ");
	}

}
