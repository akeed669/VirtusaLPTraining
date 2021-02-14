package com.akeed.gunstore.model.customer;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue
    int id;
    String lastName;
    String zipcode;
    String gunLicense;

    public Customer() {
    }
}
