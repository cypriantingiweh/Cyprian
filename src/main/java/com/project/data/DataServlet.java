package com.project.data;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataServlet
 */
@WebServlet("/DataServlet.do")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
	     response.setContentType("text/html; charset = UTF-8");
	      String password = request.getParameter("password");
	      String username = request.getParameter("username");
	      //connect to my mysql and verify username and password
	      
	      try {
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  java.sql.Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
	    	  java.sql.PreparedStatement pc = c.prepareStatement("select USERNAME,passwords from ventors where USERNAME = ? and passwords =?");
	    	  pc.setString(1,username);
	    	  pc.setString(2,password);
	    	  
	    	  ResultSet rs = pc.executeQuery();
	    	  
	    	  if(rs.next()) {
	    		  
	    		 
	    		  RequestDispatcher get=request.getRequestDispatcher("/WEB-INF/views/Products.jsp");
	  			get.forward(request, response);
	    		 
	    		   	return;
	    	  }
	    	  else {
	    	  RequestDispatcher get=request.getRequestDispatcher("/WEB-INF/views/Error.jsp");
	  			get.forward(request, response);
	    	  return;
	    	  }
	    	  
	      } catch(ClassNotFoundException | SQLException e) {
	    	
	    	  ((Throwable) e).printStackTrace();
	      }
	  
	 }

}
















