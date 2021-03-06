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
@WebServlet("/EditServlet.do")
@MultipartConfig(maxFileSize = 16177215)
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	InputStream inputStream = null;
    	 
        try{
    	      String PName = request.getParameter("PName");
    	    
    	      Part filePart = request.getPart("photo");
    	    	 if (filePart != null) {
    		            // obtains input stream of the upload file
    		    	   inputStream = filePart.getInputStream();
    		        }
            String sql = "UPDATE products SET PName = ?,Picture = ? where Pid = ?";
            java.sql.Connection conn = DatabaseConnection.connect();
            PreparedStatement pst = conn.prepareStatement(sql);
           
          
            pst.setString(1,PName);
            pst.setBlob(2, inputStream);
            pst.setString(3,request.getParameter("Pid"));
           

            pst.executeUpdate();
            
            response.sendRedirect("/ProductServlet.do");

        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
	