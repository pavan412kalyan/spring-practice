package com.spring.springdemo;

public class FootBallCoach implements Coach {

	private FortuneService fortuneService;
	
	private String team;
	private String  email;

	public void setTeam(String team) {
		System.out.println("In Football Team Setter ");

		this.team = team;
	}



	public void setEmail(String email) {
		System.out.println("In Football Email Setter ");

		this.email = email;
	}

	
	

	public String getTeam() {
		
		System.out.println("In Football Team Getter ");
	
		return team;
	}



	public String getEmail() {
		System.out.println("In Football Email Getter ");

		return email;
	}



	//no constr arg
	public FootBallCoach()
	{
		System.out.println("In Football constr ");
     }

	
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In foot setter");
		this.fortuneService = fortuneService;
	}




	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "this is from Football class";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return  fortuneService.getFortune();
	}



	@Override
	public String getSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
}
