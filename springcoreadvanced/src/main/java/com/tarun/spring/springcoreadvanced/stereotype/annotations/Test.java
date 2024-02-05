package com.tarun.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/tarun/spring/springcoreadvanced/stereotype/annotations/config.xml");
		Instructor i = (Instructor) ac.getBean("ins");

		System.out.println(i);

		//@Scope 
		Instructor i1 = (Instructor) ac.getBean("ins");

		System.out.println(i1.hashCode());

		Instructor i2 = (Instructor) ac.getBean("ins");

		System.out.println(i2.hashCode());
	
		//@Value
		System.out.println(i1);
		System.out.println(i2);
		
		
		//SpEL
		
		Instructor i3 = (Instructor) ac.getBean("ins");

		System.out.println(i3);
		
	}

}
