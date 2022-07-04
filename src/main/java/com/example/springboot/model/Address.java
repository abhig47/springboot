package com.example.springboot.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {
    private String streetaddress;
    private String city;
    private String state;
    private String zipcode;
    private String country;
}
