package com.adi.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPrintZeroOne {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		
		exec.execute(new PrintZeroThread());
		
		exec.shutdown();
		
	}

}
