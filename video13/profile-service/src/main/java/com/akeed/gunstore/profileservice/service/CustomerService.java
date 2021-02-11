package com.akeed.gunstore.profileservice.service;

import com.akeed.gunstore.commons.model.Customer;
import com.akeed.gunstore.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface CustomerService {


    Customer save(Customer customer);

    List<Customer> getAll();

    Customer getCustomer(int customerNumber);
}
