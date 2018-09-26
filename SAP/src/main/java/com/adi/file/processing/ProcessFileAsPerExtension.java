package com.adi.file.processing;

import java.util.List;

import com.adi.file.FileType;
import com.adi.model.transaction.Transaction;

public class ProcessFileAsPerExtension {
	public static List<Transaction> processFileAsPerExtension(String fileExtension, String filePath){
		
		if(fileExtension.equalsIgnoreCase(FileType.CSV.getFileType())) {
			System.out.println("Processing CSV file");
			ProcessCSVFile processCSVFile = new ProcessCSVFile();
			return processCSVFile.processFile(filePath);
		}
		
		if(fileExtension.equalsIgnoreCase(FileType.EXCEL.getFileType())) {
			System.out.println("Processing EXCEL file");
			return null;
		}
		return null;
		
	}
}
