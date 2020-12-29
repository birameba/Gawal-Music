package com.gawal.service.impl;

import com.gawal.dao.CustomerOrderDao;
import com.gawal.model.Cart;
import com.gawal.model.CartItem;
import com.gawal.model.CustomerOrder;
import com.gawal.service.CartService;
import com.gawal.service.CustomerOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Le on 1/23/2016.
 */

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal=0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            grandTotal=grandTotal+item.getTotalPrice();
        }

        return grandTotal;
    }
}
