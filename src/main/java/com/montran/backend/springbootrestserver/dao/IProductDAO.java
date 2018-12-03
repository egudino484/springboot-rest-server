package com.montran.backend.springbootrestserver.dao;


import com.montran.backend.springbootrestserver.dto.Product;

public interface IProductDAO {
    Product findById(Integer id );
}
