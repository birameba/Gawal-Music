package com.gawal.dao;

import java.io.IOException;

import com.gawal.model.Cart;

/**
 * Created by Le on 1/23/2016.
 */
public interface CartDao {

    Cart getCartById(int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
