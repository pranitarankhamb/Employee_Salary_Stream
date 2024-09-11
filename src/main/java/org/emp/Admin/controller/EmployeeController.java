package org.emp.Admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.emp.model.EmloyeeModel;
import org.emp.service.EmpServ;
import org.emp.service.EmployeeServiceImpl;

@WebServlet("/emp")
public class EmployeeController<EmployeeService> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 String name=request.getParameter("name");
		 String department=request.getParameter("department");
		 Date join_date=(Date.valueOf(request.getParameter("join_date")));
		 int primary_contact=Integer.valueOf(request.getParameter("primary_contact"));
		 int secondary_contact=(Integer.valueOf(request.getParameter("secondary_contact")));
		 String email=request.getParameter("email");
		 Date birth_date=(Date.valueOf(request.getParameter("birth_date")));
		 String gender=request.getParameter("gender");
		 String address=request.getParameter("address");
		 
		 EmloyeeModel empModel = new EmloyeeModel();
		 empModel.setName(name);
		 empModel.setDepartment(department);
		 empModel.setJoin_date(join_date);
		 empModel.setPrimary_contact(primary_contact);
		 empModel.setSecondary_contact(secondary_contact);
		 empModel.setEmail(email);
		 empModel.setBirth_date(birth_date);
		 empModel.setGender(gender);
		 empModel.setAddress(address);
		 EmpServ e=new EmployeeServiceImpl();
		
		boolean b=e.isAddNewEmployee(empModel);
		 if(b) {
			// RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
		    // r.include(request, response);
		     out.println("<h1 style=\"text-align: center; color: green; font-size: 34px; margin-left: 80px; margin-top: 250px;\">Employee Added Successfully</h1>");

		 }
		 else {
			 RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
		     r.include(request, response);
		     out.println("<h1 style=\"text-align: center; color: red; font-size: 34px; margin-left: 80px; margin-top: 250px;\">Employee Not Added Successfully</h1>");

		 }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

} 


