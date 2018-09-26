package com.adi.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPrintZeroOne {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i< 5; i++) {
			exec.execute(new PrintZeroThread());
			exec.execute(new PrintOneThread());
		}
		
		
		
		exec.shutdown();
		
	}

}
