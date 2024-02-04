package com.tarun.spring.springcore.assignment.propertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/tarun/spring/springcore/assignment/propertiesfile/config.xml"); 
		
		SpringConfiguration s = (SpringConfiguration) ac.getBean("sc");
		
	}

}
