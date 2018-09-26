package com.adi.file;

public enum FileType {
	CSV("txt"),
	EXCEL("xlsx"),
	XML("xml");
	
	private String fileType;
	 
	FileType(String fileType) {
        this.fileType = fileType;
    }
 
    public String getFileType() {
        return fileType;
    }
}
