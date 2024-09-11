package org.emp.Admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.emp.model.AdminModel;
import org.emp.repository.AdminRepository;
import org.emp.repository.AdminRepositoryImpl;
import org.emp.service.AdminServiceImpl;



@WebServlet("/loginServlet")
public class AdminLoginController<AdminService> extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 
		 String Username= request.getParameter("username");
		 String password = request.getParameter("pass");
		 
		 AdminModel admodel = new AdminModel();
		 admodel.setUsername(Username);
		 admodel.setPassword(password);
		 
		AdminRepository ad=new AdminRepositoryImpl();
		boolean b= ad.isCheckLogin(admodel);
		if(b)
		{
//			HttpSession session = request.getSession();
//			session.setAttribute(Username, Username);
			
			RequestDispatcher r=request.getRequestDispatcher("AdminDashboard.jsp");
		     r.include(request, response);
		}
		else {
			RequestDispatcher r=request.getRequestDispatcher("error.jsp");
		     r.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
