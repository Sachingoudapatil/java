package com.xworkz.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.Dto.ServiceDto;
import com.xworkz.Service.Service;
import com.xworkz.Service.ServiceImplement;

@WebServlet(loadOnStartup = 1,urlPatterns = "/Login")
public class SignupServlet extends HttpServlet {
	public SignupServlet() {
		System.out.println("created SignupServlet const");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	
		String user=arg0.getParameter("user");
		String email=arg0.getParameter("email");
		String password=arg0.getParameter("password");
		String conformPassword=arg0.getParameter("conformpassword");
		
		ServiceDto signupDTO=new ServiceDto(user, email, password, conformPassword);
		
		Service imp=new ServiceImplement();
		boolean isvalid= imp.valid(signupDTO);
		
		if(isvalid) {
			arg0.setAttribute("success",user+" your signup completed");
		}
		else {
			arg0.setAttribute("failure",user+" your signup failure");
			arg0.setAttribute("dto", signupDTO);
		}
		RequestDispatcher requestDispatcher=arg0.getRequestDispatcher("Signup.jsp");
		requestDispatcher.forward(arg0,arg1);
	}

}
	


