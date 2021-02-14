package com.akeed.gunstore.model.firearm;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "firearm")
public class Firearm {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue
    int id;
    String firearmType;
    String name;
    String modelNo;
    String manufacturer;
    String originCountry;
    int year;

    public Firearm() {
    }
}
