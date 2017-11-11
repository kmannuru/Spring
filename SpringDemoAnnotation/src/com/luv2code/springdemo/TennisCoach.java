package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Value("${foo.name}")
	private String teamName;
	@Value("${foo.email}")
	private String email;
	
	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your back-hand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getDailyFortune();
	}
	
	// define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }
    
    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }
    
    public String getTeamName() {
    		return teamName;
    }
    
    public String getEmail() {
    		return email;
    }
}
