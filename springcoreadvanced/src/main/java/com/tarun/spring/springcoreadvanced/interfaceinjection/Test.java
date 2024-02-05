package com.tarun.spring.springcoreadvanced.interfaceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/tarun/spring/springcoreadvanced/interfaceinjection/config.xml");
		OrderBoImpl o = (OrderBoImpl) ac.getBean("bo");

		o.plcsOrder();
	}

}
