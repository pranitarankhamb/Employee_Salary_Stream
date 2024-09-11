package org.emp.Admin.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.emp.model.AttendacneModel;
import org.emp.repository.AttendaceRepositoryImpl;

@WebServlet("/Attendance")
public class AttendanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		AttendaceRepositoryImpl repository = new AttendaceRepositoryImpl();
		int empid = 0; 

		String empidParam = request.getParameter("empId");
		
		System.out.println("emp param is "+ empidParam);
		if (empidParam != null && !empidParam.isEmpty()) {
			try {
				empid = Integer.parseInt(empidParam);
			} catch (NumberFormatException e) {
				System.err.println("Error parsing empid: " + e.getMessage());
				e.printStackTrace(); // log the error
			}
		} else {
			System.err.println("Empid parameter is null or empty.");
		}

		String Adate = request.getParameter("date");
		
		
		String inTime = request.getParameter("inTime");
		String outTime = request.getParameter("outTime");
		String status = request.getParameter("status");

		
	System.out.println("=========>"+Adate);
	System.out.println("=========>"+inTime);
	System.out.println("=========>"+outTime);
	System.out.println("=========>"+status);
	
	//____________________________________________________________________
	
	java.sql.Date sqldate=null;
	AttendacneModel attendaceModel = new AttendacneModel();
	try {
	
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date=format.parse(Adate);
		
		sqldate=new java.sql.Date(date.getTime());
		
		System.out.println("____________SQLDATE____________"+sqldate);
		
	} catch (Exception e) {
	
	}
	

		
		
		attendaceModel.setEmpid(empid);
		attendaceModel.setDate(sqldate);
		attendaceModel.setInTime(inTime);
		attendaceModel.setOutTime(outTime);
		attendaceModel.setStatus(status);
		
		
		boolean b = repository.addAtt(attendaceModel);
		
		
		
		if (b) 
		
		{
			System.out.println("Attendance saved successfully.");
		} 
		
		else {
			System.out.println("Failed to save attendance.");
		}

		request.setAttribute("attendaceModel", attendaceModel);
		RequestDispatcher dispatcher = request.getRequestDispatcher("MarkAttendanceEmployee.jsp");
		dispatcher.forward(request, response);

		System.out.println("Attendance processing completed for empid: " + empid);
		System.out.println("Attendance processing completed for Adate: " + Adate);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}