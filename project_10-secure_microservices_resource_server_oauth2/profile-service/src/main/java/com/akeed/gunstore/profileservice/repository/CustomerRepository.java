package com.akeed.gunstore.profileservice.repository;

import com.akeed.gunstore.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
