package com.tarun.spring.springcore.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SudentTest {

	public static void main(String[] args) {
			
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/tarun/spring/springcore/referencetype/reftypeconfig.xml");
	
		Student s = (Student) ac.getBean("student");
		
		System.out.println(s);
	}

}
