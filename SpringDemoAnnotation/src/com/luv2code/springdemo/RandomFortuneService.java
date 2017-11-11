package com.luv2code.springdemo;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RandomFortuneService implements FortuneService{
	
	@Value("${foo.fortunes}")
	private String[] fortunes;
	//private String[] fortunes = {"Beware of the strangers", "Have a nice weekend", "Practice makes you perfect"};

	@Override
	public String getDailyFortune() {
		// TODO Auto-ed method stub
		return fortunes[new Random().nextInt(fortunes.length)];
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("init method");
		System.out.println("fortunes = "+Arrays.toString(fortunes));
	}
	
	@PreDestroy
	public void destoryMethod() {
		System.out.println("in destroy method of RandomFortuneService");
	}

}
