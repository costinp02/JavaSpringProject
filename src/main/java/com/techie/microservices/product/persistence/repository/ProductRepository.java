package com.techie.microservices.product.persistence.repository;

import com.techie.microservices.product.persistence.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository <Product, String> {
}
