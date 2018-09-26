package com.adi.file.processing;

public enum ProcessingFee {
	INTRADAY(10),
	
	HIGHPRIORITY(500),
	
	NORMALPRIORITYWITHSELLANDWITHDRAW(100),
	
	NORMALPRIORITYWITHBUYANDDEPOSIT(50);
	
	private int getFee;
	 
	ProcessingFee(int getFee) {
        this.getFee = getFee;
    }
 
    public int getFee() {
        return getFee;
    }
}
