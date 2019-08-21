package com.project.signin;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignInServlet.do")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
	     
	      RequestDispatcher get=request.getRequestDispatcher("/WEB-INF/views/Sign-in.jsp");
			get.forward(request, response);
			   
	   }
	
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	   {
	      String name = request.getParameter("name");
	      String password = request.getParameter("password");
	      String username = request.getParameter("username");
	      
	      request.setAttribute("name", name);
	      request.setAttribute("password", password);
	      request.setAttribute("username", username);
	     
	      RequestDispatcher get=request.getRequestDispatcher("/WEB-INF/views/Checkandsubmit.jsp");
			get.forward(request, response);
			   
	   }
	
}
