package com.spring.springdemo;


public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
		
	String[] quotes = new String[] {"quote1","quote2","quote3","quote4"};	
	
	int index =(int) (Math.random()*3);
	System.out.println("index=="+index);
		return quotes[index];
	}

}
