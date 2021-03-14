package com.spring.springdemo.mvc;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {

	
	private String firstName;
	private String lastName;
	private String country;
	private String code;
	
	
	private String[] systems;
	
	

//	private LinkedHashMap<String,String> countryOptions;
	
	



public Student() {
		
//	countryOptions = new LinkedHashMap<String, String>();
//	countryOptions.put("IND","INDAIA");
//	countryOptions.put("PAk","pak");
//	countryOptions.put("sl","SRILAM");

	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


   public String[] getSystems() {
	   
	   System.out.println(Arrays.toString(systems));
		return systems;
	}

	public void setSystems(String[] systems) {
		this.systems = systems;
		
	}

	
	
//	public LinkedHashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}
	
	
}
