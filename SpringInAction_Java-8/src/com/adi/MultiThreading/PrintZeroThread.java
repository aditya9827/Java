package com.adi.MultiThreading;

import java.util.concurrent.TimeUnit;

public class PrintZeroThread implements Runnable{
	
	@Override
	public void run() {
		System.out.println(0);
		try {
			TimeUnit.MILLISECONDS.wait(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
