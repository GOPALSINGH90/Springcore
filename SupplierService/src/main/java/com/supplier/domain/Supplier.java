package com.supplier.domain;

public class Supplier {
	private Long id;
	private String supplierName;
	private Order order;

	public Supplier() {
	}

	// Construct based dependency Injection
	public Supplier(Order order) {
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Order getOrder() {
		return order;
	}

}
