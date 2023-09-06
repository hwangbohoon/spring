package com.example.aopexam.dao;

import com.example.aopexam.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductDaoImpl implements ProductDao{
    private Map<String, Product> storeage = new HashMap();

    @Override
    public void addProduct(Product product) {
        System.out.println("productDao addProduct start!!");
        storeage.put(product.getName(), product);
        System.out.println("productDao addProduct end!!");
    }

    @Override
    public Product findProduct(String name) {
        System.out.println("productDao findProduct start!!");
        return storeage.get(name);
    }
}
