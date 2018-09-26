package com.adi.MultiThreading;

import java.util.concurrent.TimeUnit;

public class PrintOneThread implements Runnable{
	@Override
	public void run() {
		
		System.out.println(1);
		try {
			TimeUnit.MILLISECONDS.wait(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
