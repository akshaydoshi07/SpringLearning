package com.springproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterDepInjectionCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public SetterDepInjectionCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return null;
	}

	@Override
	public String getDailyFortune() {
		return "SetterDependencyInjection: " + fortuneService.getFortune();
	}

}
