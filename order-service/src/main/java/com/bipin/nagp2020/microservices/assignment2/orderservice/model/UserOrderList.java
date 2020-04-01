package com.bipin.nagp2020.microservices.assignment2.orderservice.model;

import java.util.List;

public class UserOrderList {
	private List<Order> orders;

	public UserOrderList() {

	}

	public UserOrderList(List<Order> orders) {
		super();
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
