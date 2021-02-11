package com.akeed.gunstore.profileservice.controller;

import com.akeed.gunstore.commons.model.Customer;
import com.akeed.gunstore.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customers")
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping("/customers")
    @PreAuthorize("hasRole('ROLE_admin')")
    public List<Customer> getAllCustomers(){
        return customerService.getAll();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable(value = "id") int customerNumber){
        Customer customer = customerService.getCustomer(customerNumber);
        if(customer != null){
            return ResponseEntity.ok().body(customer);
        }
        return ResponseEntity.notFound().build();
    }


}
