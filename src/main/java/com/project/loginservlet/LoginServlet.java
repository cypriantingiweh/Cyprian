package com.project.loginservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.project.connection.DatabaseConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
	    
	    	  RequestDispatcher get = request.getRequestDispatcher("/WEB-INF/views/Login.jsp");
	  			get.forward(request, response);
	    	  }
	 
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
	     response.setContentType("text/html; charset = UTF-8");
	      String password = request.getParameter("password");
	      String username = request.getParameter("username");
	      
	      
	      try {
	    	  java.sql.Connection c = DatabaseConnection.connect();
	    	  java.sql.PreparedStatement pc = c.prepareStatement("select USERNAME,passwords from ventors where USERNAME = ? and passwords =?");
	    	  pc.setString(1,username);
	    	  pc.setString(2,password);
	    	  
	    	  ResultSet rs = pc.executeQuery();
	    	  
	    	  if(rs.next()) {
	    		  
	    		 
	    		  RequestDispatcher get=request.getRequestDispatcher("/WEB-INF/views/Homepage.jsp");
	  			get.forward(request, response);
	    		 
	    		   	return;
	    	  }
	    	  else {
	    		  RequestDispatcher get=request.getRequestDispatcher("/WEB-INF/views/Login.jsp");
	  			get.forward(request, response);
	    	  return;
	    	  }
	    	  
	      } catch(Exception e) {
	    	
	    	  ((Throwable) e).printStackTrace();
	      }
	  
	 }

}
	  