package com.supplier.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.supplier.domain.User;
import com.supplier.service.MyService;
import com.supplier.serviceimpl.MyServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.supplier")
public class AppConfig {
	@Bean
	public MyService myService() {
		return new MyServiceImpl();
	}

	@Bean
	 @Scope(value="singleton")
	public User myuser() {
		return new User();
	}

}
