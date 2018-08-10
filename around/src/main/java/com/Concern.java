package com;

import org.aspectj.lang.ProceedingJoinPoint;

public class Concern {

	public Object additionalTask(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Additional Logic Before...");
		System.out.println("Going to..." + pjp.getTarget());
		Object obj = pjp.proceed();
		System.out.println("Additional Logic After...");
		return obj;
	}
	
	public void doStuff() {
		System.out.println("Did Stuff");
	}

}