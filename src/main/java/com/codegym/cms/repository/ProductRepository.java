package com.codegym.cms.repository;

import com.codegym.cms.model.Product;
import com.codegym.cms.model.Sectors;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
    Iterable<Product> findAllByTen(String name);
}
