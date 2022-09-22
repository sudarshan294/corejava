package com.jdbc.jdbcExamplee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample1 {
	public static void main(String[] args) {
		
		InsertExample1.insertData();
	}
	public static void insertData()
		{
		
		Connection con = null ;
		// Register a Driver class
		//Open a connection
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/corejava","root","sidhu");
			
			//create a statement and Execute Query
			
			String sql ="insert into student(Lastname,Firstname,Age)values('ganesh','gane', 22)";
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			if (i > 0)
			{
				System.out.println("intserted sucessfully");
			}
			else
			{
				System.out.println("Record not inserted.....");
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			//Close connection 
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
