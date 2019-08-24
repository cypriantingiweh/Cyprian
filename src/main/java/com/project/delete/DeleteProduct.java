package com.project.delete;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.connection.DatabaseConnection;
import com.project.todo.Todo;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/deleteproducts.do")
public class DeleteProduct extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
        	
            String sql = "Delete From market where Pid=?";
            java.sql.Connection conn = DatabaseConnection.connect();
            PreparedStatement pst = conn.prepareStatement(sql);
            
           pst.setString(1, request.getParameter("Pid"));
            
           
            pst.executeUpdate();
            
         
           
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        response.sendRedirect("/ProductServlet.do");

    }
}
