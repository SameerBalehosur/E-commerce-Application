package com.testyantra.product.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.testyantra.product.dto.ProductRequest;
import com.testyantra.product.dto.ProductResponse;
import com.testyantra.product.model.Product;
import com.testyantra.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
	private final ProductRepository productRepository;

	@SuppressWarnings("static-access")
	public void createProduct(ProductRequest productRequest) {

		Product product = new Product().builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();

		productRepository.save(product);
		log.info("Product {} is saved", product.getId());
	}

	public List<ProductResponse> getAllProducts() {
		List<Product> findAll = productRepository.findAll();
		return findAll.stream().map(this::mapToProducts).collect(Collectors.toList());
	}
	private ProductResponse mapToProducts(Product product) {
		
		return ProductResponse.builder()
				.id(product.getId())
				.name(product.getName())
				.description(product.getDescription())
				.price(product.getPrice())
				.build();
		
	}
}
