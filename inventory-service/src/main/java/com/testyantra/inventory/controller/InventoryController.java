package com.testyantra.inventory.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.inventory.dto.InventoryResponse;
import com.testyantra.inventory.service.InventoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
	
	private final InventoryService inventoryService;
	
	@GetMapping
    @ResponseStatus(HttpStatus.OK)
	public List<InventoryResponse> inStockCheck(@RequestParam List<String> skuCode) {
		return inventoryService.isInStock(skuCode);
	}

}
