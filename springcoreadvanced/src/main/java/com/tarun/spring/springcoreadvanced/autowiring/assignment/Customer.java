package com.tarun.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private String name;

	private Reservation reservation;

	@Override
	public String toString() {
		return "Customer [name=" + getName() + ", reservation=" + getReservation() + "]";
	}

	public Reservation getReservation() {
		return reservation;
	}

	@Autowired
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
