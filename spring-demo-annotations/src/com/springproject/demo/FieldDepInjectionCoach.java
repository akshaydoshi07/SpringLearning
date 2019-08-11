package com.springproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldDepInjectionCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public FieldDepInjectionCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return null;
	}

	@Override
	public String getDailyFortune() {
		return "FieldDepInjection: " + fortuneService.getFortune();
	}

}
