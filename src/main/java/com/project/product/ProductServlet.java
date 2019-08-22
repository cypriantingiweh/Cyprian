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


  public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
;

  					List<Todo> dataList = new ArrayList(); 

  			try {
  						java.sql.Connection c = DatabaseConnection.connect();
  		  	    	  java.sql.PreparedStatement pc = c.prepareStatement("select * from market");
  		  	    	  
  		  	    	 //pc.setString(1,username);
  			    	 // pc.setString(2,password);

  		  	    	  	pc.executeQuery ();

  		  	    	ResultSet rs = pc.getResultSet();

						  while (rs.next()){
						
						  //Add records into data list
						
						
						  dataList.add(new Todo(rs.getString("Pid"),rs.getString("PName"),rs.getString("PCategory")));
						  
						

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