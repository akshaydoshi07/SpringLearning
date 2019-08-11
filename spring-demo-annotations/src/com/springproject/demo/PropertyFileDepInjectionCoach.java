package com.springproject.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyFileDepInjectionCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.teamName}")
	private String team;

	@Override
	public String getDailyWorkout() {
		return "Property File injection";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getTeam() {
		return this.team;
	}

}
