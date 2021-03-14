package com.spring.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ControllerSecond {

	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworldform";
		
	}
	
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
		
	}
	
	//anothrt cotroller to add MODEL DATA 
	
	
	@RequestMapping("/processForm2")
	public String Captalize(HttpServletRequest request, Model model)
	{
		//Read the request from html form
		String name = request.getParameter("name");
		name = name.toUpperCase();
		
		model.addAttribute("name", name);
		
		
		
		return "helloworld";
	}
	
	
	
	
}
