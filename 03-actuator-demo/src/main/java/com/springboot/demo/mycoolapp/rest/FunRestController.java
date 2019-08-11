package com.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")
	public String sayHello()
	{
		return "Hello world! Time on server is "+ LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String sayWorkout()
	{
		return "Run 5KM daily";
	}

}
