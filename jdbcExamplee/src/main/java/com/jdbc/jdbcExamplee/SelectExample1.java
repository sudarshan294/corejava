package com.jdbc.jdbcExamplee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class SelectExample1 {
	
	public static Logger log = Logger.getLogger(SelectExample1.class);
	
	public static void main(String[] args) {
		
		SelectExample1.retriveData();
	}
	
	public static void retriveData() {
		Connection con = null ;
		// Register a Driver class
		//Open a connection
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/corejava","root","sidhu");
			
			//create a statement and Execute Query
			
			String sql ="select * from student ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				log.info(rs.getString("id"));
				log.info(rs.getString("Lastname"));
				log.info(rs.getString("Firstname"));
				log.info(rs.getString("Age"));
				
				log.info("=============");
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
