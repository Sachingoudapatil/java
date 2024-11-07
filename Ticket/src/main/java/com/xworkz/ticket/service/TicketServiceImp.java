package com.xworkz.ticket.service;

import com.xworkz.ticket.Dto.TicketDto;
import com.xworkz.ticket.repo.TicketRepository;
import com.xworkz.ticket.repo.TicketRepositoryImp;

public class TicketServiceImp implements TicketService {

		@Override
		public boolean isValidAndSave(TicketDto ticketDTO) {
			boolean valid =true;
			if(ticketDTO!=null) {
				String ticketName=ticketDTO.getStadiumName();
				if(ticketName!=null) {
					System.out.println("ticket name is valid");
				}
				else {
					System.err.println("ticket name is not valid");
					valid=false;
				}
				
				int ticketNo=ticketDTO.getTickets();
				if(ticketNo>0) {
					System.out.println("ticketNo is valid");
				}
				else {
					System.err.println("ticketNo is not valid");
					valid=false;
				}
				
				long contact=ticketDTO.getPrimaryContact();
				if(contact>0) {
					System.out.println("ticketNo is valid");
				}
				else {
					System.err.println("ticketNo is not valid");
					valid=false;
				}
				String email = ticketDTO.getEmail();
				if (email != null && email.contains("@") && (email.endsWith(".com") || email.endsWith(".in"))) {
					System.out.println("Email is valid");
				} else {
					System.out.println("Email is not vallid");
					valid = false;
				}
			TicketRepository ticketRepositoryImp=new TicketRepositoryImp();
			int pk=ticketRepositoryImp.save(ticketDTO);
			if(pk>0) {
				System.out.println("data saved into database");
				valid=true;
				
			}
			else {
				System.out.println("data not saved into database");
				valid=false;
			}
			}
			
			return valid;
		}

	}



