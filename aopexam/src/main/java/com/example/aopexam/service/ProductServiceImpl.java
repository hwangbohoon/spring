package com.example.aopexam.service;

import com.example.aopexam.dao.ProductDao;
import com.example.aopexam.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductDao productDao;

//    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void addProduct(Product product) {
        System.out.println("service addProduct start!!");
        productDao.addProduct(product);
        System.out.println("service addProduct end!!");
    }

    @Override
    public Product findByProductName(String name) {
        System.out.println("service findByProductName run!!");
        return productDao.findProduct(name);
    }
}
