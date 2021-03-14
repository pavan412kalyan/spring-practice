package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Intstructor;
import com.hibernate.demo.entity.Review;
import com.hibernate.demo.entity.Student;


public class DeleteCoursesforStudent {

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
	      
	  int  id =10;
	  
	  //get the student
	  Course course = session.get(Course.class, id);
	 

	  session.delete(course);    
	      
	      
	      

	 

    // commit transactions
    session.getTransaction().commit();
    
    
	}
	
	finally {
		
		session.close();
		factory.close();
	}
    
		
		
		
	}

}
