package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//load config file
	ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("ApplicationContext.xml");

		//retrive bean
	FootBallCoach footballCoach = context.getBean("myFootballCoach",FootBallCoach.class);
		//call methods
		System.out.println(footballCoach.getDailyWork());
		System.out.println(footballCoach.getDailyFortune());
		System.out.println(footballCoach.getEmail());
		System.out.println(footballCoach.getTeam());
		System.out.println(footballCoach.getSchedule());




		
		
		
		
		//close context
		context.close();
	}

}
