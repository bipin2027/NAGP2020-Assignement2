package com.bipin.nagp2020.microservices.assignment2.aggregationservice.model;

import java.util.List;

/**
 * The Class AggregateOrderData.
 */
public class AggregateOrderData {
	private User user;
	private List<Order> orderList;
	
	public AggregateOrderData() {
		
	}

	public AggregateOrderData(User user, List<Order> orderList) {
		super();
		this.user = user;
		this.orderList = orderList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
}
