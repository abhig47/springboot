package com.example.springboot.controller;

import com.example.springboot.constant.CONSTANT;
import com.example.springboot.model.Programmer;
import com.example.springboot.services.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CONSTANT.PROGRAMMERCONTROLLER)
public class ProgrammerController {

    @Autowired
    ProgrammerService programmerService;

    @PostMapping(CONSTANT.CREATEPROGRAMMER)
    public String createProgrammer(@RequestBody Programmer programmer) {
        String result = null;
        try {
            programmerService.createProgrammer(programmer);
            result = "Successfully created";
        } catch (Exception e) {
            result = "Unsuccessfully created";
        }
        return result;
    }

    @Transactional
    @GetMapping(CONSTANT.GETALLPROGRAMMER)
    public List<Programmer> getAllProgrammer() {
        List<Programmer> programmers = programmerService.getAllProgrammer();
        return programmers;
    }

//    @Transactional
//    @DeleteMapping(CONSTANT.DELETEPROGRAMMERBYID)
//    public String deleteProgrammerById(@RequestParam("id") int id) {
//        return programmerService.deleteProgrammerById(id);
//    }

}