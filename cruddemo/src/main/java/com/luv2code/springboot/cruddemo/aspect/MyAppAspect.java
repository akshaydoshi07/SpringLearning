package com.luv2code.springboot.cruddemo.aspect;

import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAppAspect {
	
	
	Logger logger = Logger.getLogger(getClass().getName());
	
	{
		SimpleFormatter formatter = new SimpleFormatter();
		FileHandler file = null;
		try {
		 file =  new FileHandler("logs/logfile.log");
		}catch(Exception e) {
			
		}
		if(null!= file) {
			logger.setLevel(Level.INFO);
			file.setFormatter(formatter);
		
			logger.addHandler(file);
		}
		System.out.println("ye chala");
	}
	
	@Pointcut("execution(* com.luv2code.springboot.cruddemo.*.*.*(..))")
	private void reusePointCut() {
		
	}
	
	@Before("reusePointCut()")
	public void logBeforeExecution(JoinPoint theJoinPoint ) {
		MethodSignature theSignature = (MethodSignature)theJoinPoint.getSignature();
		System.out.println(">>>Executing method: "+theSignature);
		logger.info(">>>Executing method: "+theSignature);
		
	}
	
	@After("reusePointCut()")
	public void logAfterExecution(JoinPoint theJoinPoint ) {
		MethodSignature theSignature = (MethodSignature)theJoinPoint.getSignature();
		System.out.println(">>>Returning from method: "+theSignature);
		logger.info(">>>Returning from method: "+theSignature);
		
	}

}
