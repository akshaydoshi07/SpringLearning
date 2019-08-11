package com.springproject.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	
	public HappyFortuneService() {
		System.out.println("HappyFotuneService wala constructor");
	}
	@Override
	public String getFortune() {
		return "Today is lucky day for you";
	}

}
