package com.tarun.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/tarun/spring/springcoreadvanced/standalone/collections/config.xml");
		ProductList e = (ProductList) ac.getBean("productlist");

		System.out.println(e);
	}

}
