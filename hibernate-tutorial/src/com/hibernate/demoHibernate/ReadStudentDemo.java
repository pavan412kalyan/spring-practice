package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;


public class ReadStudentDemo {

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
		System.out.println("Saving OBJECT");
 
    //create a student Object
	    Student student = new Student("rameshking", "sd", "email2fns");

    
    //start a transaction
	    
      session.beginTransaction();
	// System.out.println("SAVING");
     System.out.println(student);
	    
    // save student object
    session.save(student);
    
    // commit transactions
    session.getTransaction().commit();
   // System.out.println(student);

    
      //get a new session
    
    session = factory.getCurrentSession();
    session.beginTransaction();
    
    
    //retrieve 
    System.out.println("SID is>>> ="+ student.getId());
     Student retrievedStudent = session.get(Student.class, student.getId());
     System.out.println("RETRIVED"+retrievedStudent);
     
    
    
    //commit
     session.getTransaction().commit();
     
    
    
    
    

    
    
    
    
    
    
	}
	
	finally {
		factory.close();
	}
    
		
		
		
	}

}
