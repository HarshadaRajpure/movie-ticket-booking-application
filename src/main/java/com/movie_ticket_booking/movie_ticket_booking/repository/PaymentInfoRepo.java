package com.movie_ticket_booking.movie_ticket_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie_ticket_booking.movie_ticket_booking.entity.Payment_Info;

public interface PaymentInfoRepo extends JpaRepository<Payment_Info, Integer> {

}
