package com.example.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String number;
    private String type;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
