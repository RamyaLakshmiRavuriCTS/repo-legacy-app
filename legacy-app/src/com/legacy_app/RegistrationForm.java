package com.legacy_app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationForm
 */
@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Step 1: set content type
		response.setContentType("text/html");
		
		// Step 2: get the printwriter
		PrintWriter out = response.getWriter();
		
		// Step 3: generate the HTML content
		out.println("<html><body>");
		out.write("<html>" +
		"<body>" +
		"<table border='1'>" +
		"<tr>"+
		"<td>First Name<td>" +
		"<td>" +request.getParameter("firstName") + "</td>" +
		"</tr>" +
		
		"<tr>"+
		"<td>Last Name<td>" +
		"<td>" +request.getParameter("lastName") + "</td>" +
		"</tr>" +
		
		"<tr>"+
		"<td>Contact<td>" +
		"<td>" +request.getParameter("Contact") + "</td>" +
		"</tr>"+
		
		"<tr>"+
		"<td>Address<td>" +
		"<td>" +request.getParameter("Address") + "</td>" +
		"</tr>"
				);
		out.write("</table>" +
				"</body>"+
				"<html>");
		out.close();
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
