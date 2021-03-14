package com.spring.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.spring.springdemo.mvc.validation.CourseCode;

public class Customer {

	private String firstName;
	
	@NotNull(message="Lastname Required")
	@Size(min=1,message="Min Required")
	private String lastName;
	
	@NotNull(message="PASS REQUIRED")
	@Min(value=0,message="must be gretater than 0")
	@Max(value=5,message="must be less than 5")
	private Integer freePass;
	
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "Only 5 chars")
	private String postalCode;
	
	
	@CourseCode(value = "CSE",message = "Start with CSE")
	private String courseCode;
	
	
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
	
	
	
}
