package com.xworkz.ticket.Dto;

import java.io.Serializable;

 
	public class TicketDto implements Serializable {
	 private String stadiumName;
	 private int tickets;
	 private long  primaryContact;
	 private String email;
	public TicketDto() {
		super();
	}
	public TicketDto(String stadiumName, int tickets, long primaryContact, String email) {
		super();
		this.stadiumName = stadiumName;
		this.tickets = tickets;
		this.primaryContact = primaryContact;
		this.email = email;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public int getTickets() {
		return tickets;
	}
	public long getPrimaryContact() {
		return primaryContact;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "TicketDto [stadiumName=" + stadiumName + ", tickets=" + tickets + ", primaryContact=" + primaryContact
				+ ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (primaryContact ^ (primaryContact >>> 32));
		result = prime * result + ((stadiumName == null) ? 0 : stadiumName.hashCode());
		result = prime * result + tickets;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketDto other = (TicketDto) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (primaryContact != other.primaryContact)
			return false;
		if (stadiumName == null) {
			if (other.stadiumName != null)
				return false;
		} else if (!stadiumName.equals(other.stadiumName))
			return false;
		if (tickets != other.tickets)
			return false;
		return true;
	}
	
	}
	
