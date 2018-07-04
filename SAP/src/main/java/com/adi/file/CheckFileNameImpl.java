package com.adi.file;

public class CheckFileNameImpl implements CheckFileName {

	public String getFileName(String filePath) {
		System.out.println("Getting File Name");
		int fileNameIndex = filePath.lastIndexOf("\\") ;
		
		if(fileNameIndex >0 ) {
			return filePath.substring(fileNameIndex +1);
		} 
		//return null;
		return null;
	}

}
