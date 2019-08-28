package com.project.frontpage;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.connection.DatabaseConnection;
import com.project.todo.Todo;

/**
 * Servlet implementation class FrontpageServlet
 */
@WebServlet("/FrontpageServlet")
public class FrontpageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
	                    

	                   
	  					List<Todo> dataList = new ArrayList<Todo>();
	  					request.getParameter("Pid");

	  			try {
	  				
	  				
	  				
	  						java.sql.Connection c = DatabaseConnection.connect();
	  		  	    	  java.sql.PreparedStatement pc = c.prepareStatement("select * from market ");
	  		  	    	  
	  		  	    	  	pc.executeQuery ();

	  		  	    	ResultSet rs = pc.getResultSet();
	        
							  while (rs.next()){
								
								 
								  
						dataList.add(new Todo(rs.getString("Pid"),rs.getString("PName"),rs.getString("PCategory")));
							  }
							  

	  				//rs.close ();

	  				//pc.close ();
							  
					  }catch(Exception e){
					
					  System.out.println("Exception is ;"+e);
					
					  }
					
					  request.setAttribute("data", dataList );
					
					
					  RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/Fronpage.jsp");
					
					  if (dispatcher != null){
					
					  dispatcher.forward(request, response);
					
					  } 

	  }

}
