package com.example.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "pmode", discriminatorType = DiscriminatorType.STRING)
public abstract class Payment {
    @Id
    private int id;
    private double amount;
}