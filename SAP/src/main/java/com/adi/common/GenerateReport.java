package com.adi.common;

import java.util.List;

import com.adi.model.transaction.Transaction;

public class GenerateReport {
	
	public static void generateReport(List<Transaction> transactionList) {
		System.out.println("---------------------Generating Report ----------------------------------------");
		System.out.println("Client Id | Transaction Type | Transaction Date | Priority | Processing Fee    |");
		for (Transaction transaction : transactionList) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println(transaction.getClientId()+"\t| "+transaction.getTransactionType().name()+"\t| "+
					transaction.getDummyDate()+"\t| "+(transaction.isPriorityFlag()?"HIGH\t":"NORMAL")+ "\t| "+
					transaction.getProcessingfee()+"\t|");
		}
	}
}
