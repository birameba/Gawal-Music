package com.gawal.service;

import java.util.List;

import com.gawal.model.Product;

/**
 * Created by Le on 1/23/2016.
 */
public interface ProductService {

    Product getProductById(int id);

    List<Product> getProductList ();

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
