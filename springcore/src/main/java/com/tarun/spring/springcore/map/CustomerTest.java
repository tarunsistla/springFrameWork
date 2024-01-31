package com.tarun.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/tarun/spring/springcore/map/mapconfig.xml");
			
		Customer c = (Customer) ac.getBean("customer");
		
		System.out.println("Customer Id: "+ c.getcId());
		System.out.println("Products   : "+ c.getProducts());
	}

}
