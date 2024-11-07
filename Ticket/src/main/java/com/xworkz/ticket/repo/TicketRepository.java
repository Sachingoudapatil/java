package com.xworkz.ticket.repo;

import com.xworkz.ticket.Dto.TicketDto;

public interface TicketRepository {
	
	int save(TicketDto ticketDto);

}
