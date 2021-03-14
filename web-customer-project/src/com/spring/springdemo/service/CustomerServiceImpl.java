package com.spring.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springdemo.dao.CustomerDAO;
import com.spring.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	//need to inject customer dao
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		
		customerDAO.saveCustomer(customer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(customerId);
		
		
	}

	@Override
	@Transactional

	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(customerId);
		
	}

	@Override
	@Transactional

	public List<Customer> getByName(String theSearchName) {
		// TODO Auto-generated method stub
		
		return customerDAO.getByName(theSearchName);
	}

}
