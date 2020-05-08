package com.supplier.domain;

import java.util.List;

public class Flipcart {
	private String user;
	private List<String> items;

	public void setUser(String user) {
		this.user = user;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Flipcart [user=" + user + ", items=" + items + "]";
	}

}
