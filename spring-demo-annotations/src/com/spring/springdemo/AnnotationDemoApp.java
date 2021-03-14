package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ClassPathXmlApplicationContext context = new 
			ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	Coach coach  = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(coach.getDailywork());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}

}
