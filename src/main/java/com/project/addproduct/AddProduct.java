package com.project.addproduct;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.connection.DatabaseConnection;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/Addproducts.do")
public class AddProduct extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
	   
    	RequestDispatcher g=request.getRequestDispatcher("/WEB-INF/views/Addproducts.jsp");
		  g.forward(request, response);
		
	   }
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{

    	      String PName = request.getParameter("PName");
    	      String PCategory = request.getParameter("PCategory");
    	      
            
            String sql = "insert into market(PName,Pcategory) values(?,?)";
            java.sql.Connection conn = DatabaseConnection.connect();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1,PName);
            pst.setString(2, PCategory);

            pst.executeUpdate();
            
            response.sendRedirect("/ProductServlet.do");

        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
