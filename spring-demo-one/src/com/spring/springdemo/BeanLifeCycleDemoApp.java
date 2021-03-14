package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load config 
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
	//retrive bean
	
	Coach coach1 = context.getBean("mycoach",Coach.class);
	Coach coach2 = context.getBean("mycoach",Coach.class);

	
	System.out.println(coach1==coach2);//check if points same bean
	
	System.out.println(coach1+"=address\n");
	System.out.println(coach2+"=address\n");

	context.close();
		
	}

}
