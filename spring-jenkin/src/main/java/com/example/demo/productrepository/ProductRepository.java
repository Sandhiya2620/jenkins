package com.example.demo.productrepository;

import org.springframework.stereotype.Repository;
import com.example.demo.productmodel.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository <Product, Integer> {
	  Optional<Product> findByname(String name);
}
