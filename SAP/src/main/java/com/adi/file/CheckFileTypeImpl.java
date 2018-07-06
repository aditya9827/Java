package com.adi.file;

public class CheckFileTypeImpl implements CheckFileType {

	public String getFileType(String filePath) {
		
		System.out.println("Checking File Extension");
		String[] filePathArray = filePath.split("\\.");
		// return filePathArray[1];
		if (filePathArray[1].equalsIgnoreCase(FileType.CSV.getFileType())) {
			return FileType.CSV.getFileType();
		} else if (filePathArray[1].equalsIgnoreCase(FileType.EXCEL.getFileType())) {
			return FileType.EXCEL.getFileType();
		} else if (filePathArray[1].equalsIgnoreCase(FileType.XML.getFileType())) {
			return FileType.XML.getFileType();
		}
		return null;
	}

}
