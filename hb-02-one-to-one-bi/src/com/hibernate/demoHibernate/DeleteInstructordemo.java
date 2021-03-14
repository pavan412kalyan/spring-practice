package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Intstructor;


public class DeleteInstructordemo {

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
      
    //get instructor detail object and  get instructor from it 
     
      int id =3;
      
    InstructorDetail instructorDetail = session.get(InstructorDetail.class, id);
    
      
      System.out.println("instructorDetail"+instructorDetail);
      
      
      System.out.println("Intrusctor"+instructorDetail.getInstructor());
      
      
      
      
      
      //remove the association - break bi directional refernce
      
      
      instructorDetail.getInstructor().setInstructorDetail(null);
      
      
      
      //delte queury
      System.out.println("DELETING");
      session.delete(instructorDetail);
      
      
   
	 
    // commit transactions
    session.getTransaction().commit();
    
    
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	finally {
		
		session.close(); //handle the leak
		factory.close();
	}
    
		
		
		
	}

}
