package com.gawal.service;

import java.util.List;

import com.gawal.model.Customer;

/**
 * Created by Le on 1/23/2016.
 */
public interface CustomerService {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    Customer getCustomerByUsername (String username);

    List<Customer> getAllCustomers();
}
