package com.example.demo.spring.aop;

import org.springframework.stereotype.Component;

@Component("singerBean")
public class Singer implements Performance {

	@Override
	public void perform() throws Exception {

		System.out.println("Singer performing");
		throw new Exception("Error Occured");

	}

}
