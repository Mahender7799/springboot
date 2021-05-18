package com.mdits.service;

import java.util.List;

import com.mdits.model.Product;

public interface ProductService {

	public List<Product> getAllProduct();
	public Product addProduct (Product product);
	public void deleteById(int productId);
	
}
