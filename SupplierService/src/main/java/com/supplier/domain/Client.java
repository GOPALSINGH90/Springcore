package com.supplier.domain;

public class Client {
	private static Client clientService = new Client();
    private Client() {}

    public static Client createInstance() {
        return clientService;
    }
    
    public String getClientName() {
    	return "client-name";
    }
}
