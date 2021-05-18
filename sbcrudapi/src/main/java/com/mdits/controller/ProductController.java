package com.mdits.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdits.model.Product;
import com.mdits.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/view")
	public List<Product> viewAllProduct(){
		return productService.getAllProduct();
	}
	
	@PostMapping("/create")
	public Product createProduct(@RequestBody Product product) {
		return  productService.addProduct(product);
		}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct (@PathVariable Integer id) {
		productService.deleteById(id);
		return "Product Id is deleted "; 
	}
	
}
