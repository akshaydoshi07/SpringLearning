package com.springproject.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeScopeCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Prototype Scope Coach";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
