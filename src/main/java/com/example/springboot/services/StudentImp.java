package com.example.springboot.services;

import com.example.springboot.exception.ParameterNotvalidException;
import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Parameter;
import java.util.List;

@Service
public class StudentImp implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public List<Student> findALLWhereNameNQ(String name) {
        return studentRepository.findALLWhereNameNQ(name);
    }

    @Override
    public List<Student> findAllStudentNQ() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getAllStudentDataFromDatabase() {
        System.out.println("test");
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByIdFromDatanbase(int id) {
        System.out.println(studentRepository.findById(id));
        return studentRepository.findById(id).get();
    }


    @Override
    public Student addStudentDatabase(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public Student updateStudentDetailsFromDatabase(Student s) {
//        s = studentRepository.findById(id).get();
//        studentRepository.save(s);
        Student student = new Student();
        if (studentRepository.findById(s.getStudRollnu()).isPresent()) {
            student = studentRepository.save(s);
        }
        System.out.println(student);
        return student;
    }

    @Override
    public String deleteStudentFromDatabase(int id) throws ParameterNotvalidException {
        System.out.println("Student Records\n");
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return "successfully deleted";
        } else {
            throw new ParameterNotvalidException("Data Not Found");
        }
    }

}
