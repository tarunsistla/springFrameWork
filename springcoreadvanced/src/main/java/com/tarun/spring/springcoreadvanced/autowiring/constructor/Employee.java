package com.tarun.spring.springcoreadvanced.autowiring.constructor;

public class Employee {

	private Address address;

	Employee(Address address){
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
