package com.movie_ticket_booking.movie_ticket_booking.dto;

import com.movie_ticket_booking.movie_ticket_booking.entity.Ticket_Info;

public class Movie_Ticket_Acknowledgement {

	private String status;
	private double totalFair;
	private String prnno;
	private Ticket_Info ticket_Info;
	public Movie_Ticket_Acknowledgement(String status, double totalFair, String prnno, Ticket_Info ticket_Info) {
		super();
		this.status = status;
		this.totalFair = totalFair;
		this.prnno = prnno;
		this.ticket_Info = ticket_Info;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalFair() {
		return totalFair;
	}

	public void setTotalFair(double totalFair) {
		this.totalFair = totalFair;
	}

	public String getPrnno() {
		return prnno;
	}

	public void setPrnno(String prnno) {
		this.prnno = prnno;
	}

	public Ticket_Info getTicket_Info() {
		return ticket_Info;
	}

	public void setTicket_Info(Ticket_Info ticket_Info) {
		this.ticket_Info = ticket_Info;
	}

	@Override
	public String toString() {
		return "Movie_Ticket_Acknowledgement [status=" + status + ", totalFair=" + totalFair + ", prnno=" + prnno
				+ ", ticket_Info=" + ticket_Info + "]";
	}
	
	
}
