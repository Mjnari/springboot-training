package com.mjnari.spring.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.mjnari.spring.data.entities.Product;
import java.lang.String;
import java.util.List;
import java.lang.Double;

public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findByName(String name);

	List<Product> findByPrice(Double price);
	
	List<Product> findByNameAndPrice(String name, Double price);



}
