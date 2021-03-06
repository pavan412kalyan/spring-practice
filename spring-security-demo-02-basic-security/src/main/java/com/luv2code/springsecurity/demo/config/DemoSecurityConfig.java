package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;


@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

//add users for in memort
		
		
		UserBuilder user = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser(user.username("pavan1").password("1234").roles("EMPLOYEE"))
		.withUser(user.username("pavan2").password("1234").roles("MANAGER"))
		.withUser(user.username("pavan3").password("1234").roles("ADMIN"));

		
		
		
	}

	
	
	
}
