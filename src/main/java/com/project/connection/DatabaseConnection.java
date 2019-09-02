package com.project.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	private static String username="root";
	private static String password="";



		public static Connection connect()
		{
		    try
		    {
		        Class.forName("com.mysql.jdbc.Driver");  
		        String url="jdbc:mysql://localhost:3306/projectcalog";
		        Connection con = DriverManager.getConnection(url,username,password);
		        return con;
		    }
		
		    catch(Exception e)
		    {
		      return null;
		    }        
		 }

}
