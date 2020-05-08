package com.supplier.domain;

import org.springframework.stereotype.Component;

@Component("productAnn")
public class Product {
	private Long id;
	private String productName;
	
	public void initBean() {
		System.out.println("inside the bean initlization");
	}
	
	public void destroyBean() {
		System.out.println("inside the bean got destoryed");
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getAnnotationProduct() {
		return "annotation product";
	}
}
