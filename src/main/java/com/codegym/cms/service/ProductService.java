package com.codegym.cms.service;

import com.codegym.cms.model.Product;

public interface ProductService {
    Iterable<Product> findAll();
    void save(Product product);
    Product findById(Long id);
    void delete(Long id);
    Iterable<Product> search(String name);
}
