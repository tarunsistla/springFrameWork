package com.tarun.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Employee e = (Employee) ctx.getBean("emp");
		
		System.out.println("Employee ID: "+e.getId());
		System.out.println("Employee Name: "+e.getName());
		
		Employee e1 = (Employee) ctx.getBean("emp1");
		
		System.out.println("Employee ID: "+e1.getId());
		System.out.println("Employee Name: "+e1.getName());
		
		Employee e2 = (Employee) ctx.getBean("emp2");
		
		System.out.println("Employee ID: "+e2.getId());
		System.out.println("Employee Name: "+e2.getName());

	}

}
