package com.mdits.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdits.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
