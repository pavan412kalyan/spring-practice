package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Intstructor;
import com.hibernate.demo.entity.Review;
import com.hibernate.demo.entity.Student;


public class AddCoursesforStudent {

	public static void main(String[] args) {

		
		//Create a session Factory
SessionFactory factory = new Configuration()
                                 .configure("hibernate.cfg.xml")   
				                 .addAnnotatedClass(InstructorDetail.class)
				                  .addAnnotatedClass(Intstructor.class)
				                   .addAnnotatedClass(Course.class)
				                   .addAnnotatedClass(Review.class)
				                   .addAnnotatedClass(Student.class)
				                    .buildSessionFactory();
		
		
	//create Session
		
    Session session = factory.getCurrentSession();		
		
	try {
  
		   
	    //start a transaction
		    
	      session.beginTransaction();

	//paavna id =1
	      
	  int  id =1;
	  
	  //get the student
	  Student theStudent = session.get(Student.class, id);
	  
	  //create course
	  
	  Course course1 = new Course("HOCKEY");	

	  Course course2 = new Course("football");
	  
	//add student
	  course1.addstudent(theStudent);
	  course2.addstudent(theStudent);
	      
	   //save courses
	   
	   session.save(course1);
	   session.save(course2);
	      
	      
	      
	      
	      
	      

	 

    // commit transactions
    session.getTransaction().commit();
    
    
	}
	
	finally {
		
		session.close();
		factory.close();
	}
    
		
		
		
	}

}
