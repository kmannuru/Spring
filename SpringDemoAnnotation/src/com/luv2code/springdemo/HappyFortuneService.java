package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "today is your luck day";
	}

}
