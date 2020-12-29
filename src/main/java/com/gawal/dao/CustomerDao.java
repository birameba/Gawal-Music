package com.gawal.dao;

import java.util.List;

import com.gawal.model.Customer;

/**
 * Created by Le on 1/23/2016.
 */
public interface CustomerDao {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    Customer getCustomerByUsername (String username);

    List<Customer> getAllCustomers();
}
