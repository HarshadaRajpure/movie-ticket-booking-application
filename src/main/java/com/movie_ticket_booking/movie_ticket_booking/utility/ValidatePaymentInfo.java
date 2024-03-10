package com.movie_ticket_booking.movie_ticket_booking.utility;

import java.util.HashMap;
import java.util.Map;

import com.movie_ticket_booking.movie_ticket_booking.entity.Payment_Info;
import com.movie_ticket_booking.movie_ticket_booking.exception.InSufficientBalanceError;

public class ValidatePaymentInfo {
	
	private static Map<String,Double> paymentInfo=new HashMap<>();
	
	static{
		paymentInfo.put("acct1", 1000.0);
		paymentInfo.put("acct2",500.0);
		paymentInfo.put("acct3", 2000.0);
	}
	
	public static boolean  validatCreditLimit(String accNo,double paidAmount) {
		if(paidAmount > paymentInfo.get(accNo)) {
			 throw new InSufficientBalanceError("Insufficient Balance");
			
			
		}
		else {
			return true;
		}
	}
	

}
