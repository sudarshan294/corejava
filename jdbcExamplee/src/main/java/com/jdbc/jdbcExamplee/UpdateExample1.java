package com.jdbc.jdbcExamplee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample1 {
	public static void main(String[] args) {

		UpdateExample1.updateData();
	}
	public static void updateData()
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

			String sql ="Update student set Lastname ='ram' where id = 8";
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			if (i > 0)
			{
				System.out.println("Record Updated sucessfully");
			}
			else
			{
				System.out.println("Record not Updated.....");
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
