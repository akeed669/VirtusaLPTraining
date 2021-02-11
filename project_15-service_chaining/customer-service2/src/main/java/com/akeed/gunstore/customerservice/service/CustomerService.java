package com.akeed.gunstore.customerservice.service;

import com.akeed.gunstore.model.customer.Customer;

import java.util.List;

public interface CustomerService {


    Customer save(Customer customer);

    List<Customer> getAll();

    Customer getCustomer(int customerNumber);
}
