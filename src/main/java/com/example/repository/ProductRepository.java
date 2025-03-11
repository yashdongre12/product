package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
