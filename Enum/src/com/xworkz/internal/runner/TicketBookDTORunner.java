package com.xworkz.internal.runner;

import com.xworkz.internal.constants.*;
import com.xworkz.internal.dto.TicketBookDTO;

public class TicketBookDTORunner {

	public static void main(String[] args) {
		TicketBookDTO ticketBookDTO=new TicketBookDTO("OM","Prasanna theater",TicketType.ONLINE,SeatType.PREMIUM);
		System.out.println("Movie Name:"+ticketBookDTO.getMovieName());
		System.out.println("Theatre Name:"+ticketBookDTO.getTheaterName());
		System.out.println("Ticket Type:"+ticketBookDTO.getTicketType()+","+"Ticket Cost:"+ticketBookDTO.getTicketType().getCost());
		System.out.println("Seat Type:"+ticketBookDTO.getSeatType()+","+"Seat Number:"+ticketBookDTO.getSeatType().getSeatNo());
	}

}
