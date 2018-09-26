package com.adi.feeCalculator;

import java.util.List;

import com.adi.common.GenerateReport;
import com.adi.file.CheckFileName;
import com.adi.file.CheckFileNameImpl;
import com.adi.file.CheckFileType;
import com.adi.file.CheckFileTypeImpl;
import com.adi.file.processing.ProcessFileAsPerExtension;
import com.adi.model.transaction.Transaction;

public class FeeCalculation {

	private String filePath;
	private String fileName;
	private String fileExtension;
	private List<Transaction> transactionList;

	public void beginFeeCalculation(String filePath) {
		this.filePath = filePath;
		fileName = retrieveFilename(filePath);
		fileExtension = retrieveFileExtension(fileName);
		transactionList = processFileAsPerExtension(fileExtension, this.filePath);
		
		GenerateReport.generateReport(transactionList);
		//System.out.println(transactionList);
		

	}

	private List<Transaction> processFileAsPerExtension(String fileExtension2, String filePath) {
		return ProcessFileAsPerExtension.processFileAsPerExtension(fileExtension2, filePath);
	}

	private String retrieveFileExtension(String fileName2) {
		CheckFileType fileType = new CheckFileTypeImpl();
		return fileType.getFileType(fileName2);
		
	}

	private String retrieveFilename(String filePath2) {
		CheckFileName checkFileName = new CheckFileNameImpl();
		return checkFileName.getFileName(filePath2);
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
}
