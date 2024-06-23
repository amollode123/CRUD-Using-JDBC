package com.CRUD.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
public static void main(String[] args) throws ClassNotFoundException {
	//SQL query for insert
	String insert = "INSERT INTO Users (ID, USERNAME, PASSWORD) VALUES "
             + "(1, 'Ravi_Shankar', 'password1'), "
             + "(2, 'Anjali_Verma', 'password2'), "
             + "(3, 'Neha_Sharma', 'password3'), "
             + "(4, 'Amit_Kumar', 'password4'), "
             + "(5, 'Priya_Agarwal', 'password5')";
	
	//Try and Catch for exception handling
	try {
	//Loading the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("this class is loaded");
	
	//Creating Connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deepaksJDBC","root","PASSWORD@123");
	PreparedStatement ps = con.prepareStatement(insert);
	
	ps.executeUpdate();
	
	//Closing Connection
	con.close();
	System.out.println("connection is closed");
	}catch(SQLException e){
		e.printStackTrace();
	}
}
}
