package com.spring.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.test.context.event.annotation.PrepareTestInstance;

@Component
public class TennisCoach implements Coach {
     @Autowired
     @Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
//	
//    @Autowired
//	public TennisCoach(@Qualifier("happyFortune") 
//         FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
//	
	

	@Override
	public String getDailywork() {
		// TODO Auto-generated method stub
		return "This is Tennis Coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
      return fortuneService.getFortune();
		
	}
	
	
	@PostConstruct
	void onInitOfbean()
	{
		System.out.println("INIT OF BEAN");
	}
	
	@PreDestroy
	void OnDestroyBean()
	{
		System.out.println("Close OF BEAN");
	}
	
	
	
	
	

}
