package com.xworkz.runner;

import com.xworkz.dto.TicketBookDTO;
import com.xworkz.internal.*;

public class TicketBookDTORunner {

	public static void main(String[] args) {
		TicketBookDTO ticketBookDTO=new TicketBookDTO("OM","Prasanna theater",TicketType.ONLINE,SeatType.PREMIUM);
		System.out.println("Movie Name:"+ticketBookDTO.getMovieName());
		System.out.println("Theatre Name:"+ticketBookDTO.getTheaterName());
		System.out.println("Ticket Type:"+ticketBookDTO.getTicketType()+","+"Ticket Cost:"+ticketBookDTO.getTicketType().getCost());
		System.out.println("Seat Type:"+ticketBookDTO.getSeatType()+","+"Seat Number:"+ticketBookDTO.getSeatType().getSeatNo());
	}

}
