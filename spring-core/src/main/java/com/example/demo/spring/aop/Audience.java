package com.example.demo.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	@Pointcut("execution(* com.example.demo.spring.aop.Performance.perform()) && bean(singerBean)")
	public void performance() {

	}

	// @Before("execution(* com.example.demo.spring.aop.Performance.perform())")
	@Before("performance()")
	private void silenceCellPhone() {
		System.out.println("Silence Cell phones");
	}

	// @Before("execution(* com.example.demo.spring.aop.Performance.perform())")
	@Before("performance()")
	private void takeSeats() {
		System.out.println("Take Your seats");
	}

	// @AfterReturning("execution(*
	// com.example.demo.spring.aop.Performance.perform())")
	@AfterReturning("performance()")
	public void applause() {
		System.out.println("Clap Clap Clap !!!");
	}

	// @AfterThrowing(pointcut = "execution(* *(..))", throwing = "ex")

	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Refund Money");

	}

	// @Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		System.out.println("Silence Cell phones");
		System.out.println("Take Your seats");
		try {
			jp.proceed();
			System.out.println("Clap Clap Clap !!!");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("Refund our money");
		}

	}

}
