package com.example.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    private int id;
    private String name;
    @Embedded
    private Address address;
}
