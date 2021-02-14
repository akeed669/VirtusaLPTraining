package com.akeed.gunstore.profileservice.controller;

import com.akeed.gunstore.commons.model.Customer;
import com.akeed.gunstore.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/profile")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping("/profiles")
    public List<Customer> getAllCustomers(){
        return customerService.getAll();
    }

    @GetMapping("/profile")
    public Customer getCustomer(@RequestParam("customerNumber") int customerNumber){
        return customerService.getCustomer(customerNumber);
    }


}
