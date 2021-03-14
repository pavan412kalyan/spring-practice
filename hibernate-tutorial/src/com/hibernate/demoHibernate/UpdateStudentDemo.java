package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;


public class UpdateStudentDemo {

	public static void main(String[] args) {

		
		//Create a session Factory
SessionFactory factory = new Configuration()
                                  .configure("hibernate.cfg.xml")   
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		
	//create Session
		
    Session session = factory.getCurrentSession();		
		
	try {
     
    
     int StudentId =1;
     session= factory.getCurrentSession();
     session.beginTransaction();
     
     
     //retrieve based on Pkey
     
     Student student = session.get(Student.class, StudentId);
    
     //update
     student.setFirstName("new_name");
    
     //commit
     
     session.getTransaction().commit();
    

    //other query
     session= factory.getCurrentSession();
     session.beginTransaction();
     
     //query to upfate emails
     
     session.createQuery("update Student set email='foo@gmail.com'")
             .executeUpdate();
     
     session.getTransaction().commit();

     
     
     
     
     
     
    
    
    
    
	}
	
	finally {
		factory.close();
	}
    
		
		
		
	}

}
