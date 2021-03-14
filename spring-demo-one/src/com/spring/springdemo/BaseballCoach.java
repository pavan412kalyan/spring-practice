package com.spring.springdemo;

public class BaseballCoach implements Coach{

	
	//define field for fortune service
	private FortuneService fortuneService;
	
	//define constructor for dependency onjection
  public BaseballCoach(FortuneService fortuneService)
	{
	  this.fortuneService = fortuneService;
	  
	}
	
	
  @Override
	public String getDailyWork() {
		return "baseball coaching";
	}

@Override
public String getDailyFortune() {

	//use Fortuneservice helper(Dependency) to get fortune 
	
	return fortuneService.getFortune();
}


@Override
public String getSchedule() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}
