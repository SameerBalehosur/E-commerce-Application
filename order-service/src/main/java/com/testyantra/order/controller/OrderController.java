package com.testyantra.order.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.order.dto.OrderRequest;
import com.testyantra.order.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
	
	private final OrderService OrderService;

	@PostMapping("/placeorder")
	@ResponseStatus(HttpStatus.OK)
	public String placeOrder(@RequestBody OrderRequest orderRequest) {
		OrderService.placeOrder(orderRequest);
		return "Order Placed Ok";
		
	}
}
