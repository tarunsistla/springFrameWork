package com.tarun.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("com/tarun/spring/springcore/lc/annotations/annotationconfig.xml");
			
		Patient p = (Patient) ac.getBean("patient");
		
		System.out.println(p);
		
		ac.registerShutdownHook();
	}

}
