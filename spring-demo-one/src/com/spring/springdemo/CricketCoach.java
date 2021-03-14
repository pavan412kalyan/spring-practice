package com.spring.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public CricketCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "this is cricket";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "from cricket class ->"+fortuneService.getFortune();
	}

	@Override
	public String getSchedule() {
		// TODO Auto-generated method stub
		return "SUNDAY";
	}
	
	
	//add init method
	public void onStartOfBean()
	{
		System.out.println("ON Start INIT BEAN");
	}
	
	//add a destroy method
	public void onDestroyMethod()	
	{
		System.out.println("ON DESTROY INIT BEAN");

	}
	
	
	

}
