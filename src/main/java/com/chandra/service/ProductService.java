package com.chandra.service;

import com.chandra.entity.Product;
import com.chandra.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    ProductRepo productRepo;

    public  ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

        public void getProducts() {
            List<Product> products =productRepo.getAllProducts();
            products.forEach(p->{
                System.out.println(p);
            });

        }
    }

