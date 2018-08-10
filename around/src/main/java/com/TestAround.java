package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAround {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		Operations e = (Operations) context.getBean("operation");

		e.task1();		
	}
}
