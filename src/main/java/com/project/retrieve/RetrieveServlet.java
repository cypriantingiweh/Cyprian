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
@WebServlet("/RetrieveServlet.do")
@MultipartConfig(maxFileSize = 16177215)
public class RetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  ResultSet rs;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
	   
    	String Pidc = request.getParameter("Pid");
    	String PNamec = request.getParameter("PName");
	      String PCategoryc = request.getParameter("PCategory");
//debugging strings
	      //System.out.print(Pidc);
	     // System.out.print(PNamec);
	     // System.out.print(PCategoryc);
	      
	      request.setAttribute("P-Name", PNamec);
	      request.setAttribute("P-Category", PCategoryc);
	      request.setAttribute("P-id", Pidc);
	      
	      
			try{
				java.sql.Connection c = DatabaseConnection.connect();
				String sql ="select Picture from products where Pid = "+ Pidc +"";
				  java.sql.PreparedStatement pc = c.prepareStatement(sql);
				
					pc.executeQuery ();
		  	    	 rs = pc.getResultSet();
						 
		  	    while(rs.next()){
						    Blob blob = rs.getBlob("Picture");
							InputStream inputStream = blob.getBinaryStream();
							ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
							byte[] buffer = new byte[4096];
							int bytesRead = -1;
							while ((bytesRead = inputStream.read(buffer)) != -1) {
								outputStream.write(buffer, 0, bytesRead);
							}
							byte[] imageBytes = outputStream.toByteArray();
							String baseimg = Base64.getEncoder().encodeToString(imageBytes);
							inputStream.close();
							outputStream.close();
							request.setAttribute("Image",baseimg);
					}
		  	  RequestDispatcher g=request.getRequestDispatcher("/WEB-INF/views/Edit.jsp");
			  g.forward(request, response);
							
						}catch(SQLException e){
				            e.printStackTrace();
				        }
		
	   }
	
}
	