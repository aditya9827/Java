package com.adi.file.processing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.adi.common.Utility;

public class ProcessCSVFile implements ProcessFile {

	public static final String fileSplitter = ",";
	//private String[] transactionArray = new String [100];
	private String line = "";

	public void processFile(String filePath) {
		System.out.println("Processing CSV File");

		try (BufferedReader bufferReader = new BufferedReader(new FileReader(filePath))) {
			//if (!bufferReader.readLine().isEmpty()) {
				while((line = bufferReader.readLine()) != null) {
					String [] transactionArray=  line.split(fileSplitter);
					Utility.populateTransaction(transactionArray);
				}
			//}

		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
