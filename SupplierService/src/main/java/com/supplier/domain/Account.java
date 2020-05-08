package com.supplier.domain;

import java.util.Map;

public class Account {
	
	private long accountId;
	private String accountName;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	private Map<String, Integer> accounts;

    public void setAccounts(Map<String, Integer> accounts) {
        this.accounts = accounts;
    }

	public Map<String, Integer> getAccounts() {
		return accounts;
	}
    
    

}
