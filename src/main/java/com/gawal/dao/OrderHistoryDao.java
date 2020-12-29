package com.gawal.dao;

import com.gawal.model.Cart;

/**
 * Created by Le on 1/24/2016.
 */
public interface OrderHistoryDao {

    void addOrderHistoryByCart(Cart cart);
}
