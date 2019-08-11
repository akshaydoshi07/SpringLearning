package com.springproject.demo;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PostConstructCoach implements Coach {

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
		System.out.println("PostConstructCoach: PostConstruct method");
	}
}
