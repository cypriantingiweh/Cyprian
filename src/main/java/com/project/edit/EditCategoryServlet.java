package com.project.edit;

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
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditCategoryServlet.do")
@MultipartConfig(maxFileSize = 16177215)
public class EditCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        try{
    	      String Cid = request.getParameter("Cid");
    	    
            String sql = "UPDATE category SET Cid = ? where CName = ?";
            java.sql.Connection conn = DatabaseConnection.connect();
            PreparedStatement pst = conn.prepareStatement(sql);
           
          
            pst.setString(1,Cid);
            pst.setString(2,request.getParameter("CName"));
           

            pst.executeUpdate();
            
            response.sendRedirect("/WelcomeServlet");

        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
	