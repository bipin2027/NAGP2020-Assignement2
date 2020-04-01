package com.bipin.nagp2020.microservices.assignment2.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bipin.nagp2020.microservices.assignment2.orderservice.model.UserOrderList;
import com.bipin.nagp2020.microservices.assignment2.orderservice.serviceimpl.OrderServiceImpl;

@RestController
public class OrderServiceController {

	@Autowired
	private OrderServiceImpl orderServiceImpl;

	/**
	 * Gets the orders.
	 *
	 * @param userId the user id
	 * @return the orders
	 */
	@GetMapping("/order/{userId}")
	public UserOrderList getOrders(@PathVariable String userId) {
		UserOrderList userOrderList = orderServiceImpl.getUserOrder(Integer.parseInt(userId));
		return userOrderList;
	}

	/**
	 * Gets the all orders.
	 *
	 * @return the all orders
	 */
	@GetMapping("/orders")
	public UserOrderList getAllOrders() {
		UserOrderList userOrderList = orderServiceImpl.getAllOrders();
		return userOrderList;
	}
}
