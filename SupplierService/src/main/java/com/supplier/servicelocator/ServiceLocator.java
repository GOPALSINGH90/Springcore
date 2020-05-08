package com.supplier.servicelocator;

import com.supplier.service.AccountService;
import com.supplier.serviceImpl.AccountServiceImpl;

public class ServiceLocator {

	private static AccountService accountService = new AccountServiceImpl();

	public AccountService createAccountServiceInstance() {
		return accountService;
	}
}
