package com.project.product;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.resource.cci.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.PreparedStatement;
import com.project.connection.DatabaseConnection;
import com.project.todo.Todo;


@WebServlet("/DisplayServlet.do")
@MultipartConfig(maxFileSize = 16177215)
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		// 
		Blob blob = null;
		String Pid = request.getParameter("Pid");
		 
		try{
		 
		    java.sql.Connection c = DatabaseConnection.connect();
		    java.sql.PreparedStatement ps = c.prepareStatement("select Picture from market where Pid=?");
		    ps.setString(1, Pid);
		    ResultSet rs = (ResultSet) ps.executeQuery();
		 
		    if(rs.next()){
		       blob =  (Blob) rs.getBlob(1);
		        byte byteArray[] = blob.getBytes(1, (int)blob.length());
		 
		        response.setContentType("image/jpg");
		        OutputStream os = response.getOutputStream();
		        os.write(byteArray);
		        os.flush();
		        os.close();
		    }
		}
		catch(SQLException e){
		    e.printStackTrace();
		}
		
	}
	

}
