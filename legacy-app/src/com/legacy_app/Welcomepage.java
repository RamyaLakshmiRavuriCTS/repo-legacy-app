package com.legacy_app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
@WebServlet("/Welcomepage")
public class Welcomepage extends HttpServlet {
 
    public Welcomepage() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.isEmpty() || password.isEmpty() )
		{
			RequestDispatcher req = request.getRequestDispatcher("LogIn.jsp");
			req.include(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("Welcome.jsp");
			req.forward(request, response);
		}
	}
 
}