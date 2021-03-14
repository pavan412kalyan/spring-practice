package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load config file
		
		ClassPathXmlApplicationContext context =
	   new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean from spring container
		
	    Coach  coach = context.getBean("mycoach",Coach.class);
		
		//call method on bean
		System.out.println(coach.getDailyWork());
		
		//fortune methods - dependency methods
		System.out.println(coach.getDailyFortune());

		
		//close context
		context.close();
		
		
	}

}
