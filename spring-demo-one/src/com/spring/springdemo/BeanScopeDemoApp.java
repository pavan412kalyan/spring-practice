package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load config 
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("beanLifeCycleDemo.xml");
		
		
	//retrive bean
	
	Coach coach1 = context.getBean("mycoach",Coach.class);
	

	System.out.println(coach1.getDailyWork());
	
	context.close();
		
	}

}
