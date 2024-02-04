package com.tarun.spring.springcoreadvanced.autowiring.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	// @Autowired
	private Address address;

	@Autowired
	Employee(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	// @Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

}
