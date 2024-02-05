package com.tarun.spring.springcoreadvanced.interfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoImpl implements OrderBo {

	@Autowired
	@Qualifier("dao2") 
	private OrderDAO dao;
	
	@Override
	public void plcsOrder() {
		System.out.println("Inside the place order ");
		dao.createOrder();

	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
