package com.legacy_app;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WelcomePage")
public class WelcomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public WelcomePage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		if(userName.isEmpty() || password.isEmpty()) {
			RequestDispatcher req=request.getRequestDispatcher("Login.jsp");
			req.include(request, response);
		}
		else {
			RequestDispatcher req=request.getRequestDispatcher("Welcome.jsp");
			req.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}