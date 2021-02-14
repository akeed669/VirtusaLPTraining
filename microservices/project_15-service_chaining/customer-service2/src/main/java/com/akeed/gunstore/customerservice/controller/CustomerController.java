package com.akeed.gunstore.customerservice.controller;

import com.akeed.gunstore.model.customer.Customer;
import com.akeed.gunstore.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class CustomerController {

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
