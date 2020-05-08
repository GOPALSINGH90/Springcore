package com.supplier.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("orderAnno")
public class Order {
	private Long id;
	private String customerName;
	private String shippingAddress;

	// setter based dependency Injection
	@Autowired
	private Product productAnn;

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

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Product getProductAnn() {
		return productAnn;
	}

	public void setProductAnn(Product productAnn) {
		this.productAnn = productAnn;
	}
}
