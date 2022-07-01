package com.example.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int studRollnu;
    String studentName;
    int studStd;
    int studentSubjects;
}
