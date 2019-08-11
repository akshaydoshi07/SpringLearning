package com.springproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorDepInjectionCoach implements Coach {
	
	private FortuneService fortuneService;

	@Autowired
	public ConstructorDepInjectionCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	 

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "DependencyInjectionCoach wali class through auto wiring";
	}

	@Override
	public String getDailyFortune() {
		return "ConstructorDepInjection: " + fortuneService.getFortune();
	}

}
