package com.montran.backend.springbootrestserver.controllers;

import com.montran.backend.springbootrestserver.dao.ProductDAO;
import com.montran.backend.springbootrestserver.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductDAO productDAO;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable Integer id) {
        return productDAO.findById(id);


    }
    @RequestMapping( method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return productDAO.findAll();
    }
}
