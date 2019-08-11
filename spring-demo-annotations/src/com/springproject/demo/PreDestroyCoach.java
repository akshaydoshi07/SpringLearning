package com.springproject.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PreDestroyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return null;
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("PreConstructCoach: PostConstruct method");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("PreDestroyCoach: pre destroy method");
	}

}
