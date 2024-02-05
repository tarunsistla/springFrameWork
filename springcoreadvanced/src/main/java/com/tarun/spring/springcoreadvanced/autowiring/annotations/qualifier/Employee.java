package com.tarun.spring.springcoreadvanced.autowiring.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("address2")
	private Address address;

	

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
