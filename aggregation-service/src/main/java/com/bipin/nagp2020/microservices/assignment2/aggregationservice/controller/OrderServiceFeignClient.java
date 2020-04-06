package com.bipin.nagp2020.microservices.assignment2.aggregationservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bipin.nagp2020.microservices.assignment2.aggregationservice.model.UserOrderList;

/**
 * The Interface OrderServiceFeignClient.
 */
@FeignClient(name="order-service-feign-client", url ="${ORDER_SERVICE_URI:http://localhost}:8686")
public interface OrderServiceFeignClient {
	@GetMapping("/order/{userId}")
	UserOrderList retriveUserOrder(@PathVariable("userId") String userId);

}
