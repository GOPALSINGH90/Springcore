package com.supplier.serviceImpl;

import com.supplier.domain.Order;
import com.supplier.domain.Supplier;
import com.supplier.service.SupplierService;

public class SupplierServiceImpl implements SupplierService {

	private Supplier supplier;
	private Order order;
	
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public Supplier getSupplier() {
		return this.supplier;
	}

	@Override
	public Order getOrders() {
		
		return this.order;
	}
}
