package com.adi.file;

public class CheckFileNameImpl implements CheckFileName {

	public String getFileName(String filePath) {
		// For Macintosh, use /
		//int fileNameIndex = filePath.lastIndexOf("/") ;
		
		// For Windows use \ 
		int fileNameIndex = filePath.lastIndexOf("\\") ;
		
		if(fileNameIndex >0 ) {
			return filePath.substring(fileNameIndex +1);
		} 
		return null;
	}

}
