package com.movie_ticket_booking.movie_ticket_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie_ticket_booking.movie_ticket_booking.entity.Ticket_Info;

public interface TicketInfoRepo extends JpaRepository<Ticket_Info,String> {

}
