package com.bipin.nagp2020.microservices.assignment2.aggregationservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bipin.nagp2020.microservices.assignment2.aggregationservice.model.AggregateOrderData;
import com.bipin.nagp2020.microservices.assignment2.aggregationservice.model.User;
import com.bipin.nagp2020.microservices.assignment2.aggregationservice.model.UserOrderList;

@RestController
public class AggregationServiceController {
	@Autowired
	private OrderServiceFeignClient orderServiceFeignClient;
	
	@Autowired
	private UserServiceFeignClient userServiceFeignClient;
	
	/**
	 * Gets the aggregate order details.
	 *
	 * @param userId the user id
	 * @return the aggregate order details
	 */
	@GetMapping("/orderdetails/{userId}")
	public AggregateOrderData getAggregateOrderDetails(@PathVariable String userId) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("userId", userId);
		User userResponse = userServiceFeignClient.retriveUserDetails(userId);
		UserOrderList orderResponse = orderServiceFeignClient.retriveUserOrder(userId);
		return new AggregateOrderData(userResponse, orderResponse.getOrders());
	}
	
	@GetMapping("/aggregationService")
	public String welcome() {
		return "welcome to User order Aggregation Service";
	}
}
