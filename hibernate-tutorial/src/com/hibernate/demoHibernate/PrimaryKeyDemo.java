package com.hibernate.demoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

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
 
    //create  student Objects
	    Student student1 = new Student("pad", "sd", "email3");
	    Student student2 = new Student("rea", "ds", "email1");
	    Student student3 = new Student("kin", "sd", "email2");
   
    
    //start a transaction
	    
      session.beginTransaction();
		System.out.println("SAVING");

	    
    // save student object
    session.save(student1);    
    session.save(student2);
    session.save(student3);

    
    // commit transactions
    session.getTransaction().commit();
    
    
	}
	
	finally {
		factory.close();
	}
    
		
		
		
		
	}

}
