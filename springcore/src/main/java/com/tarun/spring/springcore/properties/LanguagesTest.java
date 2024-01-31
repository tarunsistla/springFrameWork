package com.tarun.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanguagesTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/tarun/spring/springcore/properties/propertiesconfig.xml");

		Languages l = (Languages) ac.getBean("countriesAndLangs");
		
		System.out.println("Countries and Languages: "+ l.getCountryAndLangs());
		
		System.out.println(l.toString());
	}

}
