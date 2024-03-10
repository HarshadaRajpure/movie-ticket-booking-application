package com.movie_ticket_booking.movie_ticket_booking.dto;

import com.movie_ticket_booking.movie_ticket_booking.entity.Payment_Info;
import com.movie_ticket_booking.movie_ticket_booking.entity.Ticket_Info;

public class Movie_Ticket_Request {

	private Ticket_Info ticket_Info;
	private Payment_Info payment_Info;
	public Ticket_Info getTicket_Info() {
		return ticket_Info;
	}
	public void setTicket_Info(Ticket_Info ticket_Info) {
		this.ticket_Info = ticket_Info;
	}
	public Payment_Info getPayment_Info() {
		return payment_Info;
	}
	public void setPayment_Info(Payment_Info payment_Info) {
		this.payment_Info = payment_Info;
	}
	@Override
	public String toString() {
		return "Movie_Ticket_Request [ticket_Info=" + ticket_Info + ", payment_Info=" + payment_Info + "]";
	}
	
	
}
