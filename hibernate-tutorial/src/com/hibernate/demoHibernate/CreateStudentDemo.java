package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;


public class CreateStudentDemo {

	public static void main(String[] args) {

		
		//Create a session Factory
SessionFactory factory = new Configuration()
                                  .configure("hibernate.cfg.xml")   
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		
	//create Session
		
    Session session = factory.getCurrentSession();		
		
	try {
     
    // use the sesssion to save object 
		System.out.println("OBJECT");
 
    //create a student Object
	    Student student = new Student("sdfa", "sd", "email");

    
    //start a transaction
	    
      session.beginTransaction();
		System.out.println("SAVING");

	    
    // save student object
    session.save(student);
    
    // commit transactions
    session.getTransaction().commit();
    
    
	}
	
	finally {
		factory.close();
	}
    
		
		
		
	}

}
