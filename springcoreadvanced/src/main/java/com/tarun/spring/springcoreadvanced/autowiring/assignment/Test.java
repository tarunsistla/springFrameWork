package com.tarun.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/tarun/spring/springcoreadvanced/autowiring/assignment/config.xml");
		
		Customer c= (Customer) ac.getBean("customer");
		
		System.out.println(c);
	}
}
