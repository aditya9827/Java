package com.adi.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.adi.file.FileType;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\41266\\Downloads\\SampleData.xlsx";
		String name = "csv";
		
//		String[] pathArray = path.split("\\\\");
		/*if(name.equalsIgnoreCase(FileType.CSV.name())) {
			System.out.println("Name : " + FileType.CSV.name());
		}*/
		
		//Utility.parseDate("23-11-2013");
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String dateInString = "23-11-2013";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
           // System.out.println(formatter.format(date));
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            
            cal.set
            System.out.println(cal.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
		

	}

}
