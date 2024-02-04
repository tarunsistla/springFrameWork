package com.tarun.spring.springcore.ambiguity;

public class Addition {

	Addition(int x, int y){
		System.out.println("int parameters");
		System.out.println("A: "+x+"  B: "+ y);
	}
	
	Addition(double x, double y){
		System.out.println("double parameters");
		System.out.println("A: "+x+"  B: "+ y);
	}
	
	/*Addition(String x, String y){
		System.out.println("String parameters");
		System.out.println("A: "+x+"  B: "+ y);
	}*/
}
