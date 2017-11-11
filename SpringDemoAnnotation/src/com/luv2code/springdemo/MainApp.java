package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TennisCoach coach = context.getBean("tennisCoach",TennisCoach.class);
		System.out.println("Daily workout = "+coach.getDailyWorkout());
		System.out.println("Daily fortune = "+coach.getDailyFortune());
		System.out.println("Team name ="+coach.getTeamName());
		System.out.println("Email = "+coach.getEmail());
		System.out.println("-----SOCCER COACH-------");
		Coach soccerCoach = context.getBean("soccerCoach",Coach.class);
		System.out.println("Daily workout = "+soccerCoach.getDailyWorkout());
		System.out.println("Daily fortune = "+soccerCoach.getDailyFortune());
		context.close();
	}

}
