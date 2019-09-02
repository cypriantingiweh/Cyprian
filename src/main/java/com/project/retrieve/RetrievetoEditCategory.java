package com.project.retrieve;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.connection.DatabaseConnection;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/RetrievetoEditCategory")
@MultipartConfig(maxFileSize = 16177215)
public class RetrievetoEditCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException
	   {
	   
    	String Cidc = request.getParameter("Cid");
    	String CNamec = request.getParameter("CName");
//debugging strings
	      //System.out.print(Pidc);
	     // System.out.print(PNamec);
	     // System.out.print(PCategoryc);
	      
	      request.setAttribute("C-Name", CNamec);
	     
	      request.setAttribute("C-id", Cidc);
	       
		  	  RequestDispatcher g=request.getRequestDispatcher("/WEB-INF/views/EditCategory.jsp");
			  g.forward(request, response);
							
	   }
	
}
	