package com.example.springboot.controller;

import com.example.springboot.constant.CONSTANT;
import com.example.springboot.exception.ParameterNotvalidException;
import com.example.springboot.model.Student;
import com.example.springboot.services.StudentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequestMapping(CONSTANT.STUDENT)
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(CONSTANT.SAVESTUDENT)
    public Student saveAllStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping(CONSTANT.GETALLSTUDENTNQ)
    public List<Student> findAllStudentNQ() {
        return studentService.findAllStudentNQ();
    }

    @GetMapping(CONSTANT.FINDALLSTUFENTWHERENAMENQ)
    public List<Student> findALLWhereNameNQ(@PathVariable String name) {
        return studentService.findALLWhereNameNQ(name);
    }

    @GetMapping(CONSTANT.GETALL)
    public List<Student> getAllStudent() {
        System.out.println("Get Student Method is executed");
        System.out.println(studentService.getAllStudentDataFromDatabase());
        return studentService.getAllStudentDataFromDatabase();
    }

    @GetMapping(CONSTANT.ID)
    public Student getStudent(@PathVariable("id") int id) {
        System.out.println("Get Student Method is executed");
//        System.out.println(studentService.getStudentDetailsById(id));
        return studentService.getStudentByIdFromDatanbase(id);
    }

    @PostMapping(CONSTANT.SLASH)
    public Student createStudent(@RequestBody Student student) {
        System.out.println("Post Method is Executed");
        return studentService.addStudentDatabase(student);
    }

    @PutMapping(CONSTANT.SLASH)
    public Student updateStudent(@RequestBody Student student) {
        System.out.println("Update Student Executed");
        return studentService.updateStudentDetailsFromDatabase(student);
    }

    @DeleteMapping(CONSTANT.ID)
    public String deleteStudent(@PathVariable("id") int id) throws ParameterNotvalidException {
        String s = null;
        System.out.println("Delete Student Method Executed");
        try {
            studentService.deleteStudentFromDatabase(id);
            s = "successfully deleted";
        } catch (ParameterNotvalidException p) {
            s = "Data Not Found";
        }
        return s;
    }
}