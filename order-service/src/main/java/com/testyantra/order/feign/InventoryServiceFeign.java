package com.testyantra.order.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.testyantra.order.dto.InventoryResponse;

@FeignClient(name = "InventoryFeign",url ="http://localhost:8082/api/inventory" )
public interface InventoryServiceFeign {
	@GetMapping
    @ResponseStatus(HttpStatus.OK)
	public List<InventoryResponse> inStockCheck(@RequestParam List<String> skuCode);
	}
