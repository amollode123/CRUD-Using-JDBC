package com.CRUD.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
public static void main(String[] args) throws ClassNotFoundException {
	
	//SQL query for create
	String create = "CREATE TABLE Users ("
            + "ID INT NOT NULL, "
            + "USERNAME VARCHAR(50) NOT NULL, "
            + "PASSWORD VARCHAR(50) NOT NULL)";
   
	//Try and Catch for exception handling
	try {	
	//Loading the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("this class is loaded");
	
	//Creating Connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deepaksJDBC","root","PASSWORD@123");
	Statement ps = con.createStatement();
	
	ps.execute(create);
	
	//Closing Connection
	con.close();
	System.out.println("connection is closed");
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
}
