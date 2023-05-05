package com.sbu.productservice.repository;

import com.sbu.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductRepository extends MongoRepository<Product,String> {

}
