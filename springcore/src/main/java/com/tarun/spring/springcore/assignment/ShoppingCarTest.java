package com.tarun.spring.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingCarTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/tarun/spring/springcore/assignment/assconfig.xml");
		
		ShoppingCar sc = (ShoppingCar) ac.getBean("shoppingcar");
	
		System.out.println(sc);
	}

}
