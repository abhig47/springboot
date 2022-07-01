package com.example.springboot.repository;

import com.example.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query(value = "select * from student", nativeQuery = true)
    List<Student> findAllStudentUsingNQ();

    @Query(value = "select * from student where student_name=:name", nativeQuery = true)
    List<Student> findALLWhereNameNQ(@Param("name")String name);
}
