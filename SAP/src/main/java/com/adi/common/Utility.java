package com.adi.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import com.adi.model.transaction.Transaction;
import com.adi.model.transaction.TransactionType;

public class Utility {

	public static String dateFormatter = "dd-MM-YYYY";

	public static Transaction populateTransaction(String[] transactionArray) {
		Transaction transaction = new Transaction();
		transaction.setTransactionId(transactionArray[0]);
		transaction.setClientId(transactionArray[1]);
		transaction.setSecurityId(transactionArray[2]);
		transaction.setTransactionType(parseTransactionType(transactionArray[3]));
		transaction.setTransactionDate(parseDate(transactionArray[4]));
		transaction.setMarketValue(Double.parseDouble(transactionArray[5]));
		transaction.setPriorityFlag(parsePriorityFlag(transactionArray[6]));
		return transaction;

	}

	public static TransactionType parseTransactionType(String txnType) {
		if (txnType.equalsIgnoreCase(TransactionType.BUY.name())) {
			return TransactionType.BUY;
		} else if (txnType.equalsIgnoreCase(TransactionType.DEPOSIT.name())) {
			return TransactionType.DEPOSIT;
		} else if (txnType.equalsIgnoreCase(TransactionType.SELL.name())) {
			return TransactionType.SELL;
		} else {
			return TransactionType.WITHDRAW;
		}
	}

	public static Date parseDate(String txnDate) {
//		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
//		 LocalDate dateTime = LocalDate.parse(txnDate, formatter);
//		 System.out.println(dateTime.format(formatter));
//		 return null;
		 
		 Calendar cal = Calendar.getInstance();
		 //cal.setTime(date);
		 return null;
		

	}

	public static boolean parsePriorityFlag(String priorityFlag) {
		return (priorityFlag.equals("Y") || priorityFlag.equals("y")) ? true : false;
	}
}
