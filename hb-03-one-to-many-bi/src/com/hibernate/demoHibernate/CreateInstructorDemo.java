package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Intstructor;


public class CreateInstructorDemo {

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
    
//		//Create Objects
//	Intstructor intstructor = new Intstructor("pavm","Kal","@fna.com");
//	InstructorDetail instructorDetail = new InstructorDetail("pavanTube", "pavanHobby");	
//	
//		
		
		
		//Create Objects
		Intstructor intstructor = new Intstructor("kalyan","Kal","@gmal.com");
		InstructorDetail instructorDetail = new InstructorDetail("ramsTube", "playing");	
		
	
	
	//associate the objects
	intstructor.setInstructorDetail(instructorDetail); 
	
	
	
	
    
    //start a transaction
	    
      session.beginTransaction();

	    
    // save student object
	System.out.println("SAVING"+ intstructor);

    session.save(intstructor);// will save both insstructor detail object
    
    // commit transactions
    session.getTransaction().commit();
    
    
	}
	
	finally {
		
		session.close();
		factory.close();
	}
    
		
		
		
	}

}
