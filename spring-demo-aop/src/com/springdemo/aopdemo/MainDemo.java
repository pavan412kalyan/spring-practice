package com.springdemo.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.aopdemo.dao.AccountDAO;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//read config
		
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
		
		//get bean 
		
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		
		theAccountDAO.addAccount();
		
		theAccountDAO.addAccount();

		
	    
	    
	    context.close();
		
		
	}

}
