package org.emp.Admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.emp.model.EmployeeLoginModel;
import org.emp.repository.*;


@WebServlet("/EmployeeLogin")
public class EmployeeLoginController<EmployeeLoginService> extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		EmployeeLoginModel emodel = new EmployeeLoginModel();
		emodel.setUsername(username);
		emodel.setPassword(password);
		
		EmployeeLoginRepository ed = new EmployeeLoginRepositotyImpl();
		boolean b = ed.isCheckEmployee(emodel);
		if(b) {
			RequestDispatcher r = request.getRequestDispatcher("EmployeeDashboard.jsp");
			r.include(request, response);
		}
		else {
			RequestDispatcher r = request.getRequestDispatcher("error.jsp");
			r.include(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
