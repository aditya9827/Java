package com.adi.file.processing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.adi.common.Utility;
import com.adi.model.transaction.Transaction;

public class ProcessCSVFile implements ProcessFile {

	public static final String fileSplitter = ",";
	private String line = "";
	private List<Transaction> transactionList = new ArrayList<>();

	public List<Transaction> processFile(String filePath) {

		
		Transaction transaction = null;

		try (BufferedReader bufferReader = new BufferedReader(new FileReader(filePath))) {
			while ((line = bufferReader.readLine()) != null) {
				String[] transactionArray = line.split(fileSplitter);
				transaction = Utility.populateTransaction(transactionArray);
				transactionList = Utility.calculateFee(transactionList, transaction);
			}
			// }

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transactionList;
	}

}
