package com.movie_ticket_booking.movie_ticket_booking.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie_ticket_booking.movie_ticket_booking.dto.Movie_Ticket_Acknowledgement;
import com.movie_ticket_booking.movie_ticket_booking.dto.Movie_Ticket_Request;
import com.movie_ticket_booking.movie_ticket_booking.entity.Payment_Info;
import com.movie_ticket_booking.movie_ticket_booking.entity.Ticket_Info;
import com.movie_ticket_booking.movie_ticket_booking.repository.PaymentInfoRepo;
import com.movie_ticket_booking.movie_ticket_booking.repository.TicketInfoRepo;
import com.movie_ticket_booking.movie_ticket_booking.utility.ValidatePaymentInfo;

@Service
public class MovieService {
	@Autowired
	 TicketInfoRepo ticketInfoRepo;
	@Autowired
	 PaymentInfoRepo payment_InfoRepo;
	
	public Movie_Ticket_Acknowledgement bookMovie_Ticket(Movie_Ticket_Request request) {
		Ticket_Info info=request.getTicket_Info();
		info=ticketInfoRepo.save(info);
		
		Payment_Info payment_Info=request.getPayment_Info();
		
		ValidatePaymentInfo.validatCreditLimit(payment_Info.getAccountno(),info.getTicketPrice());
		
		payment_Info.setTicketId(info.getId());
		payment_Info.setAmount(info.getTicketPrice());
		
		payment_InfoRepo.save(payment_Info);
		
		
		return new Movie_Ticket_Acknowledgement("SUCCESS", info.getTicketPrice(), UUID.randomUUID().toString().split("-")[0],info);
	}
}
