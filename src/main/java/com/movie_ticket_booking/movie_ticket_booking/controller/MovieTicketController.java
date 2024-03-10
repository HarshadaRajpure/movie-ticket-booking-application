package com.movie_ticket_booking.movie_ticket_booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie_ticket_booking.movie_ticket_booking.dto.Movie_Ticket_Acknowledgement;
import com.movie_ticket_booking.movie_ticket_booking.dto.Movie_Ticket_Request;
import com.movie_ticket_booking.movie_ticket_booking.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieTicketController {

	@Autowired
	private MovieService movieservice;
	
	@PostMapping("/bookMovieTicket")
	public Movie_Ticket_Acknowledgement bookTicket(@RequestBody Movie_Ticket_Request movie_Ticket_Request) {
		return movieservice.bookMovie_Ticket(movie_Ticket_Request);
	}
}
