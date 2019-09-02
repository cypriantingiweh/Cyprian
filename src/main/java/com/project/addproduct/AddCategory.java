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

@WebServlet( urlPatterns ="/Addcategory.do")

@MultipartConfig(maxFileSize = 16177215)
public class AddCategory extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
	   
    	RequestDispatcher g=request.getRequestDispatcher("/WEB-INF/views/Addcategory.jsp");
		  g.forward(request, response);
		
	   }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	 
        try{
			
        	String Cid = request.getParameter("Cid");
    	      String CName = request.getParameter("CName");
    	   
            String sql = "insert into category(Cid,CName) values(?,?)";
            java.sql.Connection conn = DatabaseConnection.connect();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1,Cid);
            pst.setString(2,CName);
      
            pst.executeUpdate();
            response.sendRedirect("/WelcomeServlet");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
