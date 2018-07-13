package com.adi.MultiThreading;

public class PrintOneThread implements Runnable{
	@Override
	public void run() {
		System.out.println(1);
	}
}
