package com.chandra.repository;

import com.chandra.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {

    @Query(value = "call getProductsData()",nativeQuery = true)
    public List<Product> getAllProducts();

}
