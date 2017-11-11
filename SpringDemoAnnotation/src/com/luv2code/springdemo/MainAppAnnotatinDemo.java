package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppAnnotatinDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean("tennisCoach",Coach.class);
		System.out.println("workout = "+coach.getDailyWorkout());
		System.out.println("Fortune = "+coach.getDailyFortune());

	}
	
}
