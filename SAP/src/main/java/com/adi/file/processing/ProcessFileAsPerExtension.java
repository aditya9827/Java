package com.adi.file.processing;

import com.adi.file.FileType;

public class ProcessFileAsPerExtension {
	public static void processFileAsPerExtension(String fileExtension, String filePath){
		
		if(fileExtension.equalsIgnoreCase(FileType.CSV.getFileType())) {
			ProcessCSVFile processCSVFile = new ProcessCSVFile();
			processCSVFile.processFile(filePath);
		}
		
		if(fileExtension.equalsIgnoreCase(FileType.EXCEL.getFileType())) {
			System.out.println("Processing EXCEL file");
		}
		
	}
}
