package com.project.frontpage;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.connection.DatabaseConnection;
import com.project.todo.RetrieveController;
import com.project.todo.Todo;

/**
 * Servlet implementation class FrontpageServlet
 */
@WebServlet("/FrontpageServlet")
public class FrontpageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		
	     List<Todo>prod = null;
			
				RetrieveController dao = new RetrieveController();
				prod = dao.listofproduct();
				
			
		  request.setAttribute("prod",prod);
					
					  RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/Fronpage.jsp");
					
					  dispatcher.forward(request, response);

	  }

}
