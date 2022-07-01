package com.example.springboot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "bankcheck")
//@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue("ch")
public class Check extends Payment {
    private String checkNumber;
}
