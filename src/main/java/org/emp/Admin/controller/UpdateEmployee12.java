package org.emp.Admin.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.emp.service.*;
import org.emp.model.EmloyeeModel;

@WebServlet("/UpdE12")
public class UpdateEmployee12 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid = Integer.parseInt(request.getParameter("employeeid"));
		String ename = request.getParameter("eename");
		String edepartment = request.getParameter("department");
		Date ejoindate = (Date.valueOf(request.getParameter("joinDate")));
		int eprimarymob = Integer.parseInt(request.getParameter("primary_mob "));
		int esecondarymob = Integer.parseInt(request.getParameter("secndary_mob "));
		String eemail = request.getParameter("email ");
		Date ebirthdate = (Date.valueOf(request.getParameter("birthdate")));
		String egender = request.getParameter("gender");
		String eaddress = request.getParameter("adress");
		EmloyeeModel model = new EmloyeeModel();
		model.setId(empid);
		model.setName(ename);
		model.setDepartment(edepartment);
		model.setJoin_date(ejoindate);
		model.setPrimary_contact(eprimarymob);
		model.setSecondary_contact(esecondarymob);
		model.setEmail(eemail);
		model.setBirth_date(ebirthdate);
		model.setGender(egender);
		model.setAddress(eaddress);
		
		
	     
		EmpServ eService = new EmployeeServiceImpl();
		boolean b = eService.isUpdateEmployee(model);
		if (b) {
		RequestDispatcher	r = request.getRequestDispatcher("UpdateEmployee.jsp");
			r.forward(request, response);
		} else {
			System.out.println("Employee Updated");
			//out.println("<h1>Employee Details Not Updated..........</h1>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
