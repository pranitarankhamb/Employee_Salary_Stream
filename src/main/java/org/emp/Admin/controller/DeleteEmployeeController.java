package org.emp.Admin.controller;

import java.io.IOException;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.emp.service.EmpServ;
import org.emp.service.EmployeeServiceImpl;


@WebServlet("/Del")
public class DeleteEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int eid = Integer.parseInt(request.getParameter("empid"));
//		out.println("Selected employee id is "+eid);
		
		EmpServ eService = new EmployeeServiceImpl();
		boolean b = eService.isDeleteEmployeeById(eid);
		if(b) {
			RequestDispatcher r = request.getRequestDispatcher("ViewEmployee.jsp");
			r.forward(request, response);
		}else {
			out.println("<h1>Some problem in deleteemp servelt page</h1>");
		}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
