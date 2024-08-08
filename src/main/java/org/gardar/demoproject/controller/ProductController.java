package org.gardar.demoproject.controller;

import org.gardar.demoproject.model.Product;
import org.gardar.demoproject.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String viewProducts(Model model) {
        List<Product> allProducts = productService.findAll();
        model.addAttribute("products", allProducts);
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(Product product, Model model) {
        productService.addProduct(product);
        List<Product> allProducts = productService.findAll();
        model.addAttribute("products", allProducts);
        return "products.html";
    }
}
