package com.akeed.gunstore.commons.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    int id;
    String lastName;
    String zipcode;
    String gunLicense;

    public Customer(int id, String lastName, String zipcode, String gunLicense) {
        this.id = id;
        this.lastName = lastName;
        this.zipcode = zipcode;
        this.gunLicense = gunLicense;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getGunLicense() {
        return gunLicense;
    }

    public void setGunLicense(String gunLicense) {
        this.gunLicense = gunLicense;
    }

    public Customer() {
    }
}
