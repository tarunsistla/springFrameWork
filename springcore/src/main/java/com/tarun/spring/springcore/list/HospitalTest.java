package com.tarun.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/tarun/spring/springcore/list/listconfig.xml");
		
		Hospital h = (Hospital) ac.getBean("hospital");
		
		System.out.println("Hospital Name: " + h.getName());
		System.out.println("Departments: \n"+ h.getDepartments());
		
	}

}
