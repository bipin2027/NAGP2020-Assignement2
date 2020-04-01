package com.bipin.nagp2020.microservices.assignment2.orderservice.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bipin.nagp2020.microservices.assignment2.orderservice.model.Order;
import com.bipin.nagp2020.microservices.assignment2.orderservice.model.UserOrderList;

@Service
public class OrderServiceImpl {
	private List<Order> orders = new ArrayList<Order>();

	public OrderServiceImpl() {
		orders = new ArrayList<Order>();
		initializeOrders();
	}

	private void initializeOrders() {
		Date d1 = new Date();
		Order order1 = new Order(1, 250, d1, 1);
		Order order2 = new Order(2, 50, d1, 1);
		Order order3 = new Order(3, 150, d1, 1);
		Order order4 = new Order(4, 100, d1, 2);
		Order order5 = new Order(5, 200, d1, 2);
		Order order6 = new Order(6, 350, d1, 3);
		Order order7 = new Order(7, 450, d1, 3);
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		orders.add(order5);
		orders.add(order6);
		orders.add(order7);
	}

	public UserOrderList getUserOrder(int userId) {
		List<Order> userOrders = new ArrayList<Order>();
		for (Order o : orders) {
			if (o.getuId() == userId) {
				userOrders.add(o);
			}
		}
		return new UserOrderList(userOrders);
	}
	
	public UserOrderList getAllOrders() {
		return new UserOrderList(orders);
	}

}
