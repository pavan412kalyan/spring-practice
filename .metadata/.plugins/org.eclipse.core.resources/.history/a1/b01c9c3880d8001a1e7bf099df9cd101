package com.spring.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	ClassPathXmlApplicationContext context = new 
//			ClassPathXmlApplicationContext("applicationContext.xml");
//	
//	
		
	AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		
		
		
	SwimCoach coach  = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(coach.getDailywork());
		System.out.println(coach.getDailyFortune());
		
		
		System.out.println("email is" + coach.getEmail()+ coach.getTeam());
		
		context.close();
	}

}
