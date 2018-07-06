package com.adi.feeCalculator;

public class FeeCalculator {

	public static void main(String[] args) {
		System.out.println("Initiating File processing");
		
		System.out.println("Checking for file availabilty");
		
		if(args.length != 0) {
			System.out.println("File is available");
			FeeCalculation calculateFee = new FeeCalculation();
			calculateFee.beginFeeCalculation(args[0]);
		} else {
			System.out.println("File is not available at class path");
		}
		
		//FeeCalculation.beginFeeCalculation(args[0]);
	}

}
