package com.movie_ticket_booking.movie_ticket_booking.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TICKET_INFO")
public class Ticket_Info {
	
	@Id
	
	private String id;
	private String username;
	private String email;
	private String movieName;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "DD-MM-YYYY")
	private String movieDate;

	private String movie_Time;
	private double ticketPrice;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDate() {
		return movieDate;
	}
	public void setMovieDate(String movieDate) {
		this.movieDate = movieDate;
	}
	public String getMovie_Time() {
		return movie_Time;
	}
	public void setMovie_Time(String movie_Time) {
		this.movie_Time = movie_Time;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "Ticket_Info [id=" + id + ", username=" + username + ", email=" + email + ", movieName=" + movieName
				+ ", movieDate=" + movieDate + ", movie_Time=" + movie_Time + ", ticketPrice=" + ticketPrice + "]";
	}
	
	
}
