package com.project.product;
import java.io.*;

import java.util.*;

import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.project.connection.DatabaseConnection;
import com.project.todo.Todo;


@WebServlet(urlPatterns = "/ProductServlet.do")
public class ProductServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
	  
	   
                    response.setContentType("image/jpg"); 
                  
  					List<Todo> dataList = new ArrayList<Todo>(); 

  			try {
  						java.sql.Connection c = DatabaseConnection.connect();
  		  	    	  java.sql.PreparedStatement pc = c.prepareStatement("select * from market");
  		  	    	  
  		  	    	  	pc.executeQuery ();

  		  	    	ResultSet rs = pc.getResultSet();

						  while (rs.next()){
						  //Add records into data list
						
					dataList.add(new Todo(rs.getString("Pid"),rs.getString("PName"),rs.getString("PCategory"),
							rs.getBytes("Picture")));
  					}

  				rs.close ();

  				pc.close ();

				  }catch(Exception e){
				
				  System.out.println("Exception is ;"+e);
				
				  }
				
				  request.setAttribute("data",dataList);
				
				
				  RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/Products.jsp");
				
				  if (dispatcher != null){
				
				  dispatcher.forward(request, response);
				
				  } 

  }

}