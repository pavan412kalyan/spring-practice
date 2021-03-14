package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Intstructor;


public class DeleteDemo {

	public static void main(String[] args) {

		
		//Create a session Factory
SessionFactory factory = new Configuration()
                                 .configure("hibernate.cfg.xml")   
				                 .addAnnotatedClass(InstructorDetail.class)
				                  .addAnnotatedClass(Intstructor.class)
				                    .buildSessionFactory();
		
		
	//create Session
		
    Session session = factory.getCurrentSession();		
		
	try {
    

	
    
    //start a transaction
	    
      session.beginTransaction();
      
      
      
      //get instructor by Pk
      
      int id =1;
      
      Intstructor instructor = session.get(Intstructor.class, id);

     System.out.println("Instructor is" +instructor); 
     
     if(instructor!=null)
     {
    	 //will delete instructor detail also //Cascade delete
    	 session.delete(instructor);
     }
     
	 
    // commit transactions
    session.getTransaction().commit();
    
    
	}
	
	finally {
		factory.close();
	}
    
		
		
		
	}

}
