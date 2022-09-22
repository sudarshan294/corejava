package com.jdbc.jdbcExamplee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class DeleteExample1 {
	
	public static Logger log = Logger.getLogger(UpdateExample1.class);
	
	public static void main(String[] args) {

		DeleteExample1.deleteData();
	}
	public static void deleteData()
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

			String sql ="delete from student where id = 8";
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			if (i > 0)
			{
				log.info("Record deleted sucessfully");
			}
			else
			{
				log.info("Record not deleted.....");
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
