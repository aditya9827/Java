package com.adi.common;

import com.adi.file.FileType;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\41266\\Downloads\\SampleData.xlsx";
		String name = "csv";
		
//		String[] pathArray = path.split("\\\\");
		if(name.equalsIgnoreCase(FileType.CSV.name())) {
			System.out.println("Name : " + FileType.CSV.name());
		}
		

	}

}
