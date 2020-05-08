package com.supplier.domain;

public class Customers {
	private Long id;
	private String customerName;
	private String email;
	
	public void inIt() {
		System.out.println("Beans Intialized");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void cleanUp() {
		System.out.println("Bean cleanUp");
	}
}
