package com.project.signin;

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

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/SignInServlet.do")
public class SignInServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
	     //request.getSession().getAttribute("text/html");
	      RequestDispatcher g=request.getRequestDispatcher("/WEB-INF/views/Sign-in.jsp");
			g.forward(request, response);
			   
	   }
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{

        	  String name = request.getParameter("name");
    	      String password = request.getParameter("password");
    	      String username = request.getParameter("username");
    	      
            
            String sql = "insert into ventors(passwords,USERNAME,Name) values(?,?,?)";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, password);
            pst.setString(2,username);
            pst.setString(3, name);

            pst.executeUpdate();
            
	    	  RequestDispatcher get=request.getRequestDispatcher("/WEB-INF/views/Homepage.jsp");
	  			get.forward(request, response);
	    	  return;

        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
