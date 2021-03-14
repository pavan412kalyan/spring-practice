package com.spring.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.springdemo")

@PropertySource("classpath:sport.properties")

public class SportsConfig {

	// define bean for sad Fortune serive
	

	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
		
		
	}
	
	
	
	//bean for swimcoach and dependency injection
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
		
	}
	
	
}
