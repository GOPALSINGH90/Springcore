package com.supplier.domain;

import org.springframework.stereotype.Component;

import com.supplier.repository.FortuneService;

@Component("happyFortune")
public class HappyFortuneService  implements FortuneService{

	@Override
	public String getFortuneService() {
		return "Happy Fortune service";
	}

}
