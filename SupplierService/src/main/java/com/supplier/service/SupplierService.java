package com.supplier.service;

import com.supplier.domain.Order;
import com.supplier.domain.Supplier;

public interface SupplierService {
	public Supplier getSupplier();
	public Order getOrders();
}
