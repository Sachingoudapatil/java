package com.xworkz.form.dto;

import java.io.Serializable;

public class MovieTicketDTO implements Serializable{
	
	private String name;
	private int totalTickets;
	private String theatreName ;
	private String seatType;
	private double donation;
	private String date;
	private String time;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		long temp;
		temp = Double.doubleToLongBits(donation);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((seatType == null) ? 0 : seatType.hashCode());
		result = prime * result + ((theatreName == null) ? 0 : theatreName.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + totalTickets;
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
		MovieTicketDTO other = (MovieTicketDTO) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (Double.doubleToLongBits(donation) != Double.doubleToLongBits(other.donation))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (seatType == null) {
			if (other.seatType != null)
				return false;
		} else if (!seatType.equals(other.seatType))
			return false;
		if (theatreName == null) {
			if (other.theatreName != null)
				return false;
		} else if (!theatreName.equals(other.theatreName))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (totalTickets != other.totalTickets)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "feedbackDTO [name=" + name + ", totalTickets=" + totalTickets + ", theatreName=" + theatreName
				+ ", seatType=" + seatType + ", donation=" + donation + ", date=" + date + ", time=" + time + "]";
	}
	public String getName() {
		return name;
	}
	public int getTotalTickets() {
		return totalTickets;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public String getSeatType() {
		return seatType;
	}
	public double getDonation() {
		return donation;
	}
	public String getDate() {
		return date;
	}
	public String getTime() {
		return time;
	}
	public MovieTicketDTO(String name, int totalTickets, String theatreName, String seatType, double donation, String date,
			String time) {
		super();
		this.name = name;
		this.totalTickets = totalTickets;
		this.theatreName = theatreName;
		this.seatType = seatType;
		this.donation = donation;
		this.date = date;
		this.time = time;
	}
	public MovieTicketDTO() {
		super();
	}

}
