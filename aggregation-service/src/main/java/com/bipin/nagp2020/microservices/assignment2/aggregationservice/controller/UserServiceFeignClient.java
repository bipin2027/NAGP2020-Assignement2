package com.bipin.nagp2020.microservices.assignment2.aggregationservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bipin.nagp2020.microservices.assignment2.aggregationservice.model.User;

/**
 * The Interface UserServiceFeignClient.
 */
@FeignClient(name="user-service-feign-client", url ="${USER_SERVICE_URI:http://localhost}:8700")
public interface UserServiceFeignClient {
	@GetMapping("/user/{userId}")
	User retriveUserDetails(@PathVariable("userId") String userId);

}
