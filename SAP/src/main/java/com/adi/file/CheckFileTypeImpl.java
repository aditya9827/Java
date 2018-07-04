package com.adi.file;

public class CheckFileTypeImpl implements CheckFileType {

	public String getFileType(String filePath) {
		
		System.out.println("Checking File Extension");
		String[] filePathArray = filePath.split("\\.");
		// return filePathArray[1];
		if (filePathArray[1].equalsIgnoreCase(FileType.CSV.name())) {
			return FileType.CSV.name();
		} else if (filePathArray[1].equalsIgnoreCase(FileType.EXCEL.name())) {
			return FileType.EXCEL.name();
		} else if (filePathArray[1].equalsIgnoreCase(FileType.XML.name())) {
			return FileType.XML.name();
		}
		return null;
	}

}
