package com.hibernate.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String jdbcUrl ="jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimeZone=UTC";
		
	String user ="hbstudent";
	String pass="hbstudent";

	try {
		System.out.println("COONEE");
		Connection myconn = DriverManager.getConnection(jdbcUrl,user,pass);
		System.out.println("SUCCESS");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


		
		
		
	}

}
