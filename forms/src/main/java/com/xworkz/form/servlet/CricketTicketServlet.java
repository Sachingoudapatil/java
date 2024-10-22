package com.xworkz.form.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.xworkz.form.dto.CricketTicketDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/cricket")
public class CricketTicketServlet extends HttpServlet {
	
	public CricketTicketServlet() {

		System.out.println("no arg const of CricketTicketServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String groundName=req.getParameter("groundName");
		String customerName=req.getParameter("customerName");
		String customerEmail=req.getParameter("customerEmail");
		String seatType=req.getParameter("seatType");
		String numberOfTickets=req.getParameter("numberOfTickets");
		int convetedNumberOfTickets=Integer.valueOf(numberOfTickets);
		
		CricketTicketDTO cricketTicketDTO=new CricketTicketDTO(groundName, customerName, customerEmail, seatType, convetedNumberOfTickets);
	
		System.out.println("CricketTicketDTO:"+cricketTicketDTO);
		resp.getWriter().println(cricketTicketDTO);
	}
	
	
}
