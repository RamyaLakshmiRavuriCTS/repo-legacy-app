package com.legacy_app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		out.println("<html><body>");
		
		out.write("<html>"+
		          "<body>"+
				 "<table border='1'>"+
		          "<tr>"+
				 "<td>First Name</td>"+
		          "<td>"+request.getParameter("firstName")+"</td>"+
		          "</tr>"+
		          "<tr>"+
				 "<td>Last Name</td>"+
			      "<td>"+request.getParameter("lastName")+"</td>"+
				  "</tr>"+
				  "<tr>"+
				 "<td>Address</td>"+
				  "<td>"+request.getParameter("address")+"</td>"+
				 "</tr>"+
				 "<tr>"+
				 "<td>Contact Number</td>"+
			      "<td>"+request.getParameter("contactNo")+"</td>"+
				  "</tr>"
				);
		out.write("</table>"+
				"</body>"+
				"</html>");
		
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
