package com.spring.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	//Add an intibinder to convert trim input Strings .. remove leading and trailng spaces
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, editor);
		//preprocess every String form data
		
		
		
	}
	
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "customer-form";
		
		
	}
	
	
	@RequestMapping("/processForm")
	public String processForm( 		
	@Valid @ModelAttribute("customer")	Customer thecustomer,
	BindingResult theBindingResult )
	{
	
		//System.out.println("Last"+thecustomer.getLastName()+"|");
		
		System.out.println("BRESULT"+theBindingResult);
		if(theBindingResult.hasErrors())
			return "customer-form";
		
		else
		return "customer-confirmation";
	}
	
	
	
}
