package com.example.springboot.services;

import com.example.springboot.exception.ParameterNotvalidException;
import com.example.springboot.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> findAllStudentNQ();

    List<Student> findALLWhereNameNQ(String name);

    List<Student> getAllStudentDataFromDatabase();


    Student getStudentByIdFromDatanbase(int id);


    Student addStudentDatabase(Student s);


    Student updateStudentDetailsFromDatabase(Student s);


    String deleteStudentFromDatabase(int id) throws ParameterNotvalidException;
}
