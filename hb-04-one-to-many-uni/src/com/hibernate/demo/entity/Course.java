package com.hibernate.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "course")
public class Course {

	//define Fields
	
	// define Constructors
	
	//Define Getters and Setters
	
	
	// define toString
	
	
	//Annotate Fields
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.PERSIST,
			              CascadeType.REFRESH, CascadeType.MERGE})
	@JoinColumn(name = "instructor_id")
	private Intstructor instructor;
	
	
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private List<Review> reviews;
	
	
	
	
	
	
	
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH,CascadeType.PERSIST,
            CascadeType.REFRESH, CascadeType.MERGE})
	
	@JoinTable(name="course_student",joinColumns = @JoinColumn(name="course_id"),
	                      inverseJoinColumns = @JoinColumn(name="student_id"))
	
	private List<Student> students;
	
	
	
	
	
	
	
	
	
	
	
	

	public List<Review> getReviews() {
		return reviews;
	}


	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}


	public Course()
	{
	}


	public Course(String title) {
		super();
		this.title = title;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Intstructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Intstructor instructor) {
		this.instructor = instructor;
	}


	//convience method
	
	
	
	public void addReview(Review theReview)
	{
		if(reviews == null)
		  reviews= new ArrayList();
		
		reviews.add(theReview);
		
		
		
	}
	
	
	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
	
	//conviennce methos

	

	public void addstudent(Student thStudent)
	{
		if(students == null)
		  students= new ArrayList();
		
		students.add(thStudent);
		
		
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title +"]";
	}


	
	
	
	
	
	
	
	
	
	
	
	
}
