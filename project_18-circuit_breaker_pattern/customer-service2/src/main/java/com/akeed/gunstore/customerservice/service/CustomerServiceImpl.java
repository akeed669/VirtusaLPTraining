package com.akeed.gunstore.customerservice.service;

import com.akeed.gunstore.model.customer.Customer;
import com.akeed.gunstore.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(int customerNumber) {
        Optional<Customer> customer = customerRepository.findById(customerNumber);
        if(customer.isPresent()){
            return customer.get();
        }
        return null;
    }
}
