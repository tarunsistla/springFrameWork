package com.tarun.spring.springcore.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/tarun/spring/springcore/ambiguity/config.xml");
		
		Addition a = (Addition) ac.getBean("addition");

	}

}
