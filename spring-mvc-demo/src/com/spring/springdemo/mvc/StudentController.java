package com.spring.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") // check id from xml file
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		
		//create student object
		
		Student student = new Student();
		
		// add object to model
		
		theModel.addAttribute("student",student);
		
		
	    theModel.addAttribute("countryOptions", countryOptions); 

		
		System.out.println(countryOptions.toString());
		
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student)
	{
		
		//log
	System.out.println("fir"+student.getFirstName() +"LAs"+student.getLastName());
		
		
		
		return "student-confirmation";
		
	}
	
	
	
	
}
