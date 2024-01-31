package com.tarun.spring.springcore.map;

import java.util.Map;

public class Customer {
	private int cId;
	private Map<Integer, String> products;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public Map<Integer, String> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}

}
