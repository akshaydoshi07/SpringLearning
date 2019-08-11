package com.springproject.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context  = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
	/*	//User created bean id wali class.
		Coach theCoach = context.getBean("myTennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		//default bean id walie class.
		Coach theCoach1 = context.getBean("defaultBeanIdCoach", Coach.class);
		
		System.out.println(theCoach1.getDailyWorkout());*/
		
		//Constructor DependencyInjection through AutoWiring
		/*
		 * Coach theCoach2 = context.getBean("constructorDepInjectionCoach", Coach.class);
		 * 
		 * System.out.println(theCoach2.getDailyFortune());
		 */
		
		//Setter Dependency Injection through AutoWiring
		/*
		 * Coach theCoach3 = context.getBean("setterDepInjectionCoach", Coach.class);
		 * 
		 * System.out.println(theCoach3.getDailyFortune());
		 */
		
		//Field dependency Injection through AutoWiring
		/*
		 * Coach theCoach3 = context.getBean("fieldDepInjectionCoach", Coach.class);
		 * 
		 * System.out.println(theCoach3.getDailyFortune());
		 */
		
		//Qualifier Dependency Injection through autowiring and qualifier annotation
		/*
		 * Coach theCoach3 = context.getBean("qualifierDepInjectionCoach", Coach.class);
		 * 
		 * System.out.println(theCoach3.getDailyFortune());
		 */
		
		// Property File Dependency Injection through @Value annotation
		/*
		 * PropertyFileDepInjectionCoach theCoach3 =
		 * context.getBean("propertyFileDepInjectionCoach",
		 * PropertyFileDepInjectionCoach.class);
		 * 
		 * System.out.println(theCoach3.getDailyWorkout());
		 * System.out.println(theCoach3.getEmail());
		 * System.out.println(theCoach3.getTeam());
		 */
		
		//Singleton Scope through @Scope("singleton") annotation
		/*
		 * Coach theCoach3 = context.getBean("singletonScopeCoach", Coach.class); Coach
		 * theCoach4 = context.getBean("singletonScopeCoach", Coach.class);
		 * 
		 * System.out.println(theCoach3 == theCoach4); System.out.println(theCoach3);
		 * System.out.println(theCoach4);
		 */
		
		// Prototype scope through @Scope("prototype") annotation
		/*
		 * Coach theCoach3 = context.getBean("prototypeScopeCoach", Coach.class); Coach
		 * theCoach4 = context.getBean("prototypeScopeCoach", Coach.class);
		 * 
		 * System.out.println(theCoach3 == theCoach4); System.out.println(theCoach3);
		 * System.out.println(theCoach4);
		 */
		
		// PostContruct annotation using @PostConstruct
		/*
		 * PostConstructCoach theCoach = context.getBean("postConstructCoach",
		 * PostConstructCoach.class);
		 */
		
		//PreDestroy annotation using @PreDestroy
		/*
		 * PreDestroyCoach theCoach = context.getBean("preDestroyCoach",
		 * PreDestroyCoach.class);
		 */
		
		context.close();
	}

}
