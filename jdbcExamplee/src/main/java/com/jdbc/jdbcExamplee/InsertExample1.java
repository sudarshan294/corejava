package com.jdbc.jdbcExamplee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class InsertExample1 {
	
	public static Logger log = Logger.getLogger(InsertExample1.class);
	
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
			con = DBConnection.getDBConnection();
			//create a statement and Execute Query
			
			String sql ="insert into student(Lastname,Firstname,Age)values('ganesh','gane', 22)";
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			if (i > 0)
			{
				log.info("intserted sucessfully");
			}
			else
			{
				log.info("Record not inserted.....");
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			//Close connection 
			DBConnection.closeDBConnection(con);
		}
	}
}
//
//log4j.appender.fileAppender.layout.conversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n 
