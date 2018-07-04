package com.adi.feeCalculator;

import com.adi.file.CheckFileName;
import com.adi.file.CheckFileNameImpl;
import com.adi.file.CheckFileType;
import com.adi.file.CheckFileTypeImpl;

public class FeeCalculation {

	private String filePath;
	private String fileName;
	private String fileExtension;

	public void beginFeeCalculation(String filePath) {
		setFilePath(filePath);
		fileName = retrieveFilename(filePath);
		fileExtension = retrieveFileExtension(fileName);

	}

	private String retrieveFileExtension(String fileName2) {
		CheckFileType fileType = new CheckFileTypeImpl();
		return fileType.getFileType(fileName2);
		// TODO Auto-generated method stub
		
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
