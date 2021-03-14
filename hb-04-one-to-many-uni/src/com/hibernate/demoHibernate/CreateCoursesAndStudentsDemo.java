package com.hibernate.demoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Intstructor;
import com.hibernate.demo.entity.Review;
import com.hibernate.demo.entity.Student;


public class CreateCoursesAndStudentsDemo {

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

	
	      Course course = new Course("Crickert course");
	
	      System.out.println("Saving Course...");
	      session.save(course);
	     
	      //create and add student to course
	      
	      Student student1 = new Student("paavna", "kaltna2", "pava3n1@gmail");
	      Student student2 = new Student("paavna1", "kalt3na", "pav3an1@gmail");
	      Student student3 = new Student("paavna2", "kaltna3", "paevan1@gmail");

	      
	    course.addstudent(student1);
	    course.addstudent(student2);
	    course.addstudent(student3);
	    
	    
	    //save students
	    System.out.println("Savings ...Students");
	    
	    session.save(student1);
	    session.save(student2);
	    session.save(student3);


	 

    // commit transactions
    session.getTransaction().commit();
    
    
	}
	
	finally {
		
		session.close();
		factory.close();
	}
    
		
		
		
	}

}
