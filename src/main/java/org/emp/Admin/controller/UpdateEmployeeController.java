package org.emp.Admin.controller;

import java.io.IOException;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Upd")
public class UpdateEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		out.println("<h1>update employee</h1>");
		
		String  empid = request.getParameter("empid");
		String ename = request.getParameter("name");
		String edepartment = request.getParameter("department");
		String ejoindate = request.getParameter("joinDate");
		String eprimarymob = request.getParameter("primary_mob");
		String esecondarymob = request.getParameter("secndary_mob");
		String eemail = request.getParameter("email");
		String ebirthdate = request.getParameter("birthdate");
		String egender = request.getParameter("gender");
		String eaddress = request.getParameter("adress");
		
		
//		out.println("<h1>Employee id is "+empid+"</h1>");
//		out.println("<h1>Employee name is "+ename+"</h1>");
		
//		RequestDispatcher r = request.getRequestDispatcher("AdminDashboard.jsp");
//		r.include(request, response);
//		out.println("<div class= 'col py-3'>");
//		out.println("<form class='formarea' name ='frm' action='emp' method='POST'>");
////		out.println("<center style='top:10rem'>");
//		out.println("<input type='text' name='ei' value='"+empid+"' /> <br/><br/>");
//		out.println("<input type='text' name='name1' value='"+ename+"' /> <br/><br/>");
//		out.println("<input type='submit' name='s' value='Update employee'/>");
////		out.println("<center>");
//		out.println("</div>");
		
		out.println("<!DOCTYPE html>");
	       out.println("<html 'lang=en>'");
	       out.println("<head>");
	       out.println("<meta charset'=UTF-8'>");
	       out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	       out.println(" <link rel='stylesheet' href='CSS/UpdateEmployee.css'> ");
	       out.println("<title>Employee Information Form</title>");
	       out.println("</head>");
	       out.println("<body>");
	       // Include the adminDashboard.jsp content
	      // out.println("<jsp:include page=\"adminDashboard.jsp\" />");
	       out.println("<div id='container'>");
	       out.println("<h1>Employee Information Form</h1>");
	       out.println("<center>");
	       
	       out.println("<form class='formarea' name='frm' action='UpdE12' method='POST'>");
	       
	       out.println("<input type='hidden' id='name' name='employeeid' value="+empid+" placeholder='Enter employee name' required>");
	       
	       out.println("<label for='name'>Employee Name:</label>");
	       out.println("<input type='text' id='name' name='eename' value="+ename+" placeholder='Enter employee name' required>");
	    
	       out.println("<label for='email'>Employee department:</label>");
	       out.println("<input type='text' id='dept' name='edepartment' value="+edepartment+" placeholder='Enter employee department' required>");
	       
	       out.println("<label for='email'>Employee join date:</label>");
	       out.println("<input type='date' id='jdate' name='ejoindate' value="+ejoindate+" placeholder='Enter employee joining date' required>");
	       
	       out.println("<label for='email'>Employee primary contact:</label>");
	       out.println("<input type='number' id='pmob' name='eprimarymob' value="+eprimarymob+" placeholder='Enter employee primary contact' required>");
	      
	       out.println("<label for='email'>Employee secondary contact:</label>"); 
	       out.println("<input type='number' id='smob' name='esecondarymob' value="+esecondarymob+" placeholder='Enter employee secondary contact' required>");
	       
	       out.println("<label for='email'>Employee Email:</label>");
	       out.println("<input type='email' id='email' name='eemail' value="+eemail+" placeholder='Enter employee email' required>");
	       
	       out.println("<label for='email'>Employee birthdate:</label>");
	       out.println("<input type='date' id='bdate' name='ebirthdate' value="+ebirthdate+" placeholder='Enter employee birth date' required>");
	       
	       out.println("<label for='email'>Employee gender:</label>");
	       out.println("<input type='text' id='gender' name='egender' value="+egender+" placeholder='Enter employee gender' required>");
	       
	       out.println("<label for='address'>Employee Address:</label>");
	       out.println("<textarea id='address' name='eaddress' rows='3' value="+eaddress+" placeholder='Enter employee address' required></textarea>");
	       
	       out.println("<input type='submit' name='s' value='Update Employee Details'>");
	       
	       out.println("</form>");
	       out.println("<center>");
	       out.println("</div>");
	       out.println("</body>");
	       out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
