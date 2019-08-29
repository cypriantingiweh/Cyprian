package com.project.retrieve;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.connection.DatabaseConnection;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/RetrieveServlet.do")
public class RetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
    	String Pidc = request.getParameter("Pid");
    	String PNamec = request.getParameter("PName");
	      String PCategoryc = request.getParameter("PCategory");
	      String Pictures= request.getParameter("Picture");
	      
	      System.out.print(Pidc);
	      System.out.print(PNamec);
	      System.out.print(PCategoryc);
	      
	      request.setAttribute("P-Name", PNamec);
	      request.setAttribute("P-Category", PCategoryc);
	      request.setAttribute("P-id", Pidc);
	      request.setAttribute("P-ture", Pictures);
	      
    	RequestDispatcher g=request.getRequestDispatcher("/WEB-INF/views/Edit.jsp");
		  g.forward(request, response);
		
	   }
	
}
	