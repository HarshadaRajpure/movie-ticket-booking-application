package com.movie_ticket_booking.movie_ticket_booking.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PAYMENT_INFO")
public class Payment_Info {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name="uuid2" ,strategy = "org.hibernate.id.UUIDGenerator")
	private String paymentid;
	private String accountno;
	private double amount;
	private String cardType;
	private String ticketId;
	public String getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String i) {
		this.ticketId = i;
	}
	@Override
	public String toString() {
		return "Payment_Info [paymentid=" + paymentid + ", accountno=" + accountno + ", amount=" + amount
				+ ", cardType=" + cardType + ", ticketId=" + ticketId + "]";
	}
	
	
	
	
}
