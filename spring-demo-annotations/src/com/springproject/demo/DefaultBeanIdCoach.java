package com.springproject.demo;

import org.springframework.stereotype.Component;

@Component
public class DefaultBeanIdCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Default Bean ID wala chala";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
