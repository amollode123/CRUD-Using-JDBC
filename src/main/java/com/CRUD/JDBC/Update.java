package com.CRUD.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args)throws ClassNotFoundException {
		
		//SQL query for update
		String update = "UPDATE Users SET Username = ? WHERE ID = ?";
		
		//Try and Catch for exception handling
		try {
		//Loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("this class is loaded");
		
		//Creating Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deepaksJDBC","root","PASSWORD@123");
		PreparedStatement ps = con.prepareStatement(update);
		
		ps.setString(1, "Arjun_Patel");
		ps.setString(2, "1");
		
		ps.execute();
		
		//Closing Connection
		con.close();
		System.out.println("connection is closed");
	
		}catch(SQLException e){
			e.printStackTrace();
		}
		}
}
