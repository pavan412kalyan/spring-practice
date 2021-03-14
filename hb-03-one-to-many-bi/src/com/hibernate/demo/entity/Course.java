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


	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title +"]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
