package com.example.productservice.service;

import com.example.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductByid(Long id);

    List<Product> getAllProducts();
}
