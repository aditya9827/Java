package com.adi.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.adi.file.processing.ProcessingFee;
import com.adi.model.transaction.Transaction;
import com.adi.model.transaction.TransactionType;

public class Utility {

	public static String dateFormatter = "dd-MM-yyyy";

	public static Transaction populateTransaction(String[] transactionArray) {
		Transaction transaction = new Transaction();
		transaction.setTransactionId(transactionArray[0]);
		transaction.setClientId(transactionArray[1]);
		transaction.setSecurityId(transactionArray[2]);
		transaction.setTransactionType(parseTransactionType(transactionArray[3]));
		transaction.setTransactionDate(parseDate(transactionArray[4]));
		transaction.setDummyDate(transactionArray[4]);
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
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormatter);
		Date date = null;
		try {
			date = sdf.parse(txnDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;

	}

	public static boolean parsePriorityFlag(String priorityFlag) {
		return (priorityFlag.equals("Y") || priorityFlag.equals("y")) ? true : false;
	}

	public static List<Transaction> calculateFee(List<Transaction> transactionList, Transaction transaction) {
		// TODO Auto-generated method stub
		if (transactionList.isEmpty()) {
			normalTransactionFeeProcessing(transaction);
			transactionList.add(transaction);
		} else {
			checkForIntraDayTransaction(transactionList, transaction);
		}
		return transactionList;

	}

	private static void checkForIntraDayTransaction(List<Transaction> transactionList, Transaction transaction) {
		for (Transaction txn : transactionList) {
			if (transaction.getTransactionDate().equals(txn.getTransactionDate())) {
				if (transaction.getClientId().equalsIgnoreCase(txn.getClientId())
						&& transaction.getSecurityId().equalsIgnoreCase(txn.getSecurityId())) {
					if ((transaction.getTransactionType().name().equals(TransactionType.BUY.name())
							&& (txn.getTransactionType().name().equals(TransactionType.SELL.name())))
							|| (transaction.getTransactionType().name().equals(TransactionType.SELL.name())
									&& (txn.getTransactionType().name().equals(TransactionType.BUY.name())))) {
						// intraDayTransaction = true;
						txn.setProcessingfee(ProcessingFee.INTRADAY.getFee());
						transaction.setProcessingfee(ProcessingFee.INTRADAY.getFee());
						// return true;
					}
				}
			} else {
				normalTransactionFeeProcessing(transaction);
			}
		}

		transactionList.add(transaction);
		// return null;
	}

	private static void normalTransactionFeeProcessing(Transaction transaction) {
		if (transaction.isPriorityFlag()) {
			transaction.setProcessingfee(ProcessingFee.HIGHPRIORITY.getFee());
		} else if (!transaction.isPriorityFlag()
				&& (transaction.getTransactionType().name().equals(TransactionType.SELL.name())
						|| transaction.getTransactionType().name().equals(TransactionType.WITHDRAW.name()))) {
			transaction.setProcessingfee(ProcessingFee.NORMALPRIORITYWITHSELLANDWITHDRAW.getFee());
		} else if (!transaction.isPriorityFlag()
				&& (transaction.getTransactionType().name().equals(TransactionType.BUY.name())
						|| transaction.getTransactionType().name().equals(TransactionType.DEPOSIT.name()))) {
			transaction.setProcessingfee(ProcessingFee.NORMALPRIORITYWITHBUYANDDEPOSIT.getFee());
		}

	}
}
