package com.tarun.spring.springcoreadvanced.autowiring.assignment;

public class Reservation {

	private int id;
	private String time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}
	
	

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", time=" + time + "]";
	}

	public void setTime(String time) {
		this.time = time;
	}
}
