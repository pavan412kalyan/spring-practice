package com.spring.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springdemo.entity.Customer;


@Repository
public class CustomerDAOImpl implements CustomerDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	
	public List<Customer> getCustomers() {
		
		//get hibernate session
		
		Session session = sessionFactory.getCurrentSession();
		
		
		//create and get query result list
		
		Query<Customer> query =  session.createQuery("from Customer order by lastName",Customer.class);
		
		
		List<Customer> customers  = query.getResultList();
		System.out.println(customers);
		
		//return result
		
		
		
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);

		
		
	}

	@Override
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		
		Customer customer = session.get(Customer.class,customerId);
		
		return customer;
		
		
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		
      Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Customer where id=:customerId");
		 query.setParameter("customerId", customerId);
		 query.executeUpdate();
 		
		
		
	}

	@Override
	public List<Customer> getByName(String theSearchName) {
		// TODO Auto-generated method stub
		
		theSearchName=theSearchName.trim();
		 Session session = sessionFactory.getCurrentSession();
		Query<Customer> theQuery =null; 
		if(theSearchName!=null && theSearchName.length()>0)
		{
			
			 theQuery =session.createQuery("from Customer where lower(firstName) like :theName or lower(lastName) like :theName", Customer.class);
	            theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");
			
	
			
		}
		else {
			 theQuery =session.createQuery("from Customer", Customer.class); 	
			
		}
		 
		  List<Customer> customers = theQuery.getResultList();
		
		
		return customers;
	}

}
