package com.montran.backend.springbootrestserver.dao;

import com.montran.backend.springbootrestserver.dto.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDAO implements  IProductDAO{
    @Override
    public Product findById(Integer id) {
        return new Product(1,"Macbook pro",450.0);
    }

    public  List<Product> findAll() {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(1,"Macbook pro",1200.0));
        productList.add(new Product(2,"Macbook air",1050.0));
        productList.add(new Product(3,"Sony tv",100.0));
        productList.add(new Product(4,"apple tv",450.0));
        productList.add(new Product(5,"huawei mate 20 pro",450.0));
        productList.add(new Product(6,"iphone xr",650.0));
        productList.add(new Product(7,"lenovo 7480",850.0));

        return productList;
    }
}
