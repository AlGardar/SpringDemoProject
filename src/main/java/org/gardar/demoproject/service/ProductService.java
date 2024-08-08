package org.gardar.demoproject.service;

import org.gardar.demoproject.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        Product product1 = new Product();
        product1.setName("Potato");
        product1.setPrice(4.59);
        Product product2 = new Product();
        product2.setName("Carrot");
        product2.setPrice(9.99);
        products.add(product1);
        products.add(product2);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> findAll() {
        return products;
    }
}
