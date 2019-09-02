package com.project.product;
import java.io.*;

import java.util.*;

import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.project.connection.DatabaseConnection;
import com.project.todo.RetrieveController;
import com.project.todo.Todo;


@WebServlet(urlPatterns = "/WelcomeServlet")
public class WelcomeServlet extends HttpServlet{
	private  ResultSet rs;
	 
	
	private static final long serialVersionUID = 1L;
public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException{
	
	List<Todo> result = new ArrayList<Todo>();
	try {
	java.sql.Connection c = DatabaseConnection.connect();
	String sql ="select * from category order by Cid";
	  java.sql.PreparedStatement pc = c.prepareStatement(sql);
	
		pc.executeQuery ();
	    rs = pc.getResultSet();
	    while(rs.next()){
	    	
		    result.add(new Todo(rs.getString("Cid"),rs.getString("CName")));
		  
	    }
	    
	   
	}catch(SQLException e){
        e.printStackTrace();
    }
	request.setAttribute("prod",result); 
 	  RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/Homepage.jsp");
 	  				dispatcher.forward(request, response);

  }

}