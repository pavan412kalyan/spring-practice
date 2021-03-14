package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Intstructor;
import com.hibernate.demo.entity.Review;


public class CreateCoursesAndReviewsDemo {

	public static void main(String[] args) {

		
		//Create a session Factory
SessionFactory factory = new Configuration()
                                 .configure("hibernate.cfg.xml")   
				                 .addAnnotatedClass(InstructorDetail.class)
				                  .addAnnotatedClass(Intstructor.class)
				                   .addAnnotatedClass(Course.class)
				                   .addAnnotatedClass(Review.class)

				                    .buildSessionFactory();
		
		
	//create Session
		
    Session session = factory.getCurrentSession();		
		
	try {
  
		   
	    //start a transaction
		    
	      session.beginTransaction();

	
	      Course course = new Course("CRIKKKER");
	      
	      course.addReview(new Review("GREAT COURSE"));
	      course.addReview(new Review("GREAT COURSE1"));
	      course.addReview(new Review("GREAT COURSE2"));
 
	      
	      session.save(course);
	
 

    // commit transactions
    session.getTransaction().commit();
    
    
	}
	
	finally {
		
		session.close();
		factory.close();
	}
    
		
		
		
	}

}
