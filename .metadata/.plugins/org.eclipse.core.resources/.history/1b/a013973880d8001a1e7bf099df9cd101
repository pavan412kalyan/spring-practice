package com.spring.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	ClassPathXmlApplicationContext context = new 
//			ClassPathXmlApplicationContext("applicationContext.xml");
//	
//	
		
	AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		
		
		
	Coach coach  = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(coach.getDailywork());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}

}
