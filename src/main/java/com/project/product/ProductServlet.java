package com.project.product;
import java.io.*;

import java.util.*;

import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.project.todo.RetrieveController;
import com.project.todo.Todo;


@WebServlet(urlPatterns = "/ProductServlet.do")
public class ProductServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException{
	
     List<Todo>prod = null;
		
			RetrieveController dao = new RetrieveController();
			prod = dao.listofproduct();
			
		
	  request.setAttribute("prod",prod);
	  RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/Products.jsp");
	  				dispatcher.forward(request, response);

  }

}