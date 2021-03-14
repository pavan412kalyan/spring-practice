package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Intstructor;


public class CreateCoursesDemo {

	public static void main(String[] args) {

		
		//Create a session Factory
SessionFactory factory = new Configuration()
                                 .configure("hibernate.cfg.xml")   
				                 .addAnnotatedClass(InstructorDetail.class)
				                  .addAnnotatedClass(Intstructor.class)
				                   .addAnnotatedClass(Course.class)

				                    .buildSessionFactory();
		
		
	//create Session
		
    Session session = factory.getCurrentSession();		
		
	try {
  
		   
	    //start a transaction
		    
	      session.beginTransaction();
	
	//get 	the instructor from db
		
	int id =1;
	
	Intstructor instructor = session.get(Intstructor.class, id);

		
  //create  some courses
	
	Course  course1 = new Course("Crciekt course");
	Course course2 = new Course("Football");
	
	
		//add course to instructor
	instructor.add(course1);
	instructor.add(course2);
	
		
		//sace the courses
		
		session.save(course2);
		session.save(course1);
		
		
		
	
	
	
 

    // commit transactions
    session.getTransaction().commit();
    
    
	}
	
	finally {
		
		session.close();
		factory.close();
	}
    
		
		
		
	}

}
