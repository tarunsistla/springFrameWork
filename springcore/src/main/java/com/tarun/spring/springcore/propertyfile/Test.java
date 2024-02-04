package com.tarun.spring.springcore.propertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/tarun/spring/springcore/propertyfile/config.xml");
		
		MyDAO m = (MyDAO) ac.getBean("mydao");
		
		

	}

}
