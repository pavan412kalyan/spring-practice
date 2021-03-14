package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Intstructor;


public class FetchJoinDemo {

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
	      
	      
	      //HQL
	
	//get 	the instructor from db
		
	int id =1;
	
	Query<Intstructor> query = session.createQuery("select i from "
			+ "Intstructor i JOIN FETCH i.courses where i.id=:theid",Intstructor.class);
	
	//set param on query
	query.setParameter("theid", id);

	//execute query and get Instructor
	Intstructor instructor = query.getSingleResult();
	
	
	
	System.out.println(" ===>Instrucot"+instructor);

	//get course for the Instructor	
	
	System.out.println("===>Courses"+ instructor.getCourses());	
	
	
	
 

    // commit transactions
    session.getTransaction().commit();
    
    session.close();
    

	//get course for the Instructor	
	
	System.out.println("===>Courses"+ instructor.getCourses());	
	
	
	
    
    
	}
	
	finally {
		
		session.close();
		factory.close();
	}
    
		
		
		
	}

}
