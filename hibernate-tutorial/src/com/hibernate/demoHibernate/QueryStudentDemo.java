package com.hibernate.demoHibernate;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;


public class QueryStudentDemo {

	public static void main(String[] args) {

		
		//Create a session Factory
SessionFactory factory = new Configuration()
                                  .configure("hibernate.cfg.xml")   
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		
	//create Session
		
    Session session = factory.getCurrentSession();		
		
	try {
     
  
    
    //start a transaction
	    
      session.beginTransaction();
      
      
      //query all students
      List<Student>  studentList = session.createQuery("from Student").list();
      
      //display
      
        displayStudents(studentList);
     
        //first name query
      System.out.println("first name query");
        List<Student>  studentListFirst = session.createQuery("from Student where firstName='ramesh'").list();
        
        displayStudents(studentListFirst);
      
    
        // or Query
        
        studentList = session.createQuery("from Student s where"
        		+ " s.firstName='ramesh' OR s.lastName='sd'").list(); 
        
        
        displayStudents(studentList);
        

    // commit transactions
    session.getTransaction().commit();
    
    
	}
	
	finally {
		factory.close();
	}
    
		
		
		
	}

	private static void displayStudents(List<Student> studentList) {
		for(Student s : studentList)
        {
        	System.out.println(s);
        	
        }
	}

}
