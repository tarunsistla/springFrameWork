package com.tarun.spring.springcore.assignment;

public class ShoppingCar {

	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCar [item=" + item + "]";
	}
	
	
}
