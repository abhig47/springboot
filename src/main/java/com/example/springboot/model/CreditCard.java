package com.example.springboot.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
//@Table(name = "card")
//@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue("cc")
public class CreditCard extends Payment {
    private String cardNumber;
}
