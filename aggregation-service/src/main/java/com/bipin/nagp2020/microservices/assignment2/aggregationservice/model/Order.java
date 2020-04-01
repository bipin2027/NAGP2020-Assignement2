package com.bipin.nagp2020.microservices.assignment2.aggregationservice.model;

import java.util.Date;

public class Order {
	private int orderId;
	private int orderAmount;
	private int uId;
	private Date date;

	public Order() {

	}

	public Order(int orderId, int orderAmount, Date date, int uId) {
		super();
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.date = date;
		this.uId = uId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

}
