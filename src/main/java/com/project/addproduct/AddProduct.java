package com.project.addproduct;


import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.project.connection.DatabaseConnection;

/**
 * Servlet implementation class RegisterController
 * 
 */

@WebServlet( urlPatterns ="/Addproducts.do")

@MultipartConfig(maxFileSize = 16177215)
public class AddProduct extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
	   
    	RequestDispatcher g=request.getRequestDispatcher("/WEB-INF/views/Addproducts.jsp");
		  g.forward(request, response);
		
	   }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		InputStream inputStream = null;
		 
        try{
			
        	String Pid = request.getParameter("Pid");
    	      String PName = request.getParameter("PName");
    	      String PCategory = request.getParameter("PCategory");
    	      
    	      
    	      Part filePart = request.getPart("photo");
    	      
    	    
    	       if (filePart != null) {
    	            // obtains input stream of the upload file
    	    	   inputStream = filePart.getInputStream();
    	        }
    	    
    	     
            String sql = "insert into market(Pid,PName,Pcategory,Picture) values(?,?,?,?)";
            java.sql.Connection conn = DatabaseConnection.connect();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1,Pid);
            pst.setString(2,PName);
            pst.setString(3, PCategory);
            pst.setBlob(4, inputStream);
       
            pst.executeUpdate();
           
            
            response.sendRedirect("/ProductServlet.do");
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
