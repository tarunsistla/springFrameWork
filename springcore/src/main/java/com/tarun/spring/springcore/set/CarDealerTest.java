package com.tarun.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDealerTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/tarun/spring/springcore/set/setconfig.xml");
		
		CarDealer c = (CarDealer) ac.getBean("cardealer");
		
		System.out.println("CarDealer Name: "+ c.getName());
		System.out.println("Models: "+ c.getModels());
		
	}

}
