package com.codegym.cms.service.Impl;

import com.codegym.cms.model.Product;
import com.codegym.cms.repository.ProductRepository;
import com.codegym.cms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    public void delete(Long id) {
        productRepository.delete(id);
    }

    @Override
    public Iterable<Product> search(String name) {
        return productRepository.findAllByTen(name);
    }
}
