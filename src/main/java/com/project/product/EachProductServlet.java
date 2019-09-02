package com.project.product;
import java.io.*;

import java.util.*;

import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.project.connection.DatabaseConnection;
import com.project.todo.RetrieveController;
import com.project.todo.Todo;


@WebServlet(urlPatterns = "/EachProductServlet")
@MultipartConfig(maxFileSize = 16177215)
public class EachProductServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private  ResultSet rs;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException{
			
		List<Todo> result = new ArrayList<Todo>();
		String Cname = request.getParameter("CName");

		try {
		
		java.sql.Connection c = DatabaseConnection.connect();
		String sql ="SELECT PName,Picture FROM products WHERE CName = "+Cname+"";
		  java.sql.PreparedStatement pc = c.prepareStatement(sql);
		
		  		pc.executeQuery ();
				rs = pc.getResultSet();
		    while(rs.next()){
		    	 String Pname = rs.getString("PName");
		    	 Blob blob = rs.getBlob("Picture");
		 		InputStream inputStream = blob.getBinaryStream();
		 		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		 		byte[] buffer = new byte[4096];
		 		int bytesRead = -1;
		 		while ((bytesRead = inputStream.read(buffer)) != -1) {
		 			outputStream.write(buffer, 0, bytesRead);
		 		}
		 		byte[] imageBytes = outputStream.toByteArray();
		 		String img = Base64.getEncoder().encodeToString(imageBytes);
		 		inputStream.close();
		 		outputStream.close();
			    result.add(new Todo(Pname,img));
			  
		    }
		    
		   
		}catch(SQLException e){
	        e.printStackTrace();
	    }
		request.setAttribute("prod",result); 
	 	  RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/Eachproduct.jsp");
	 	  				dispatcher.forward(request, response);
	
	  }
	}

