package com.spring.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.springdemo.dao.CustomerDAO;
import com.spring.springdemo.entity.Customer;
import com.spring.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerContoller {

	
	
	//inject customer service
	
	@Autowired
	private CustomerService customerService;
	

	
	@GetMapping("/list")
    public String listCustomers(Model model)
    {  //get customers from service
		
	List<Customer> customersList=	 customerService.getCustomers();
		
		//add to model
	
	    model.addAttribute("customers", customersList);
		
		
		
		return "list-customers";
		
		
    }
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model)
	{
		//create model to bind form data
		
		
		Customer customer = new Customer();
		
		model.addAttribute("customer",customer);
		
		
		
		
		
		return "customer-form";
		
	}
	
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer)
	{
		
		customerService.saveCustomer(customer);
		

		
		return "redirect:/customer/list";
		
		
		
		
		
	}
	
	
	@GetMapping("/showFormUpdate")
	public String showFormUpdate(@RequestParam("customerId") int customerId ,Model model)
	{
		
		 Customer customer = customerService.getCustomer(customerId);
		
		
	       model.addAttribute("customer",customer);
		
		
		
		
		
		return "customer-form";
		
	}
	
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") int customerId)
	{
		
		// Customer customer = customerService.getCustomer(customerId);
		
		
		 customerService.deleteCustomer(customerId);
		
		
		
		
		
			return "redirect:/customer/list";

		
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("theSearchName") String theSearchName,Model model)
	{
		
	  List<Customer> customers =	customerService.getByName(theSearchName);
		
		model.addAttribute("customers",customers);
		
		return "list-customers";	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
