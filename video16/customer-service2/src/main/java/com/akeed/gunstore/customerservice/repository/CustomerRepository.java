package com.akeed.gunstore.customerservice.repository;

import com.akeed.gunstore.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
