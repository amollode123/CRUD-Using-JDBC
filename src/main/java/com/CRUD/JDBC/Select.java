package com.CRUD.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
public static void main(String[] args) throws ClassNotFoundException {
	
	//SQL query for select
	String select = "SELECT * FROM Users";
  
	//Try and Catch for exception handling
	try {
	//Loading the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("this class is loaded");
	
	//Creating Connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deepaksJDBC","root","PASSWORD@123");
	
	PreparedStatement ps = con.prepareStatement(select);
	
	//ResultSet to iterate over database
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		int id = rs.getInt("ID");
		String username = rs.getString("USERNAME");
		String password = rs.getString("PASSWORD");
		
		System.out.println("ID "+id+" Username "+username+" Password "+password);
	}
	
	rs.close();
	ps.close();
	
	//Closing Connection
	con.close();
	System.out.println("connection is closed");

	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
}
