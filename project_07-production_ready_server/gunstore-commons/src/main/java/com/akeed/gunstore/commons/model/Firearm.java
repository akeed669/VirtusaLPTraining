package com.akeed.gunstore.commons.model;

import javax.persistence.*;

@Entity
@Table(name = "firearm")
public class Firearm {
    @Id
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

    public Firearm(int id, String firearmType, String name, String modelNo, String manufacturer, String originCountry, int year) {
        this.id = id;
        this.firearmType = firearmType;
        this.name = name;
        this.modelNo = modelNo;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirearmType() {
        return firearmType;
    }

    public void setFirearmType(String firearmType) {
        this.firearmType = firearmType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
