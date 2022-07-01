package com.example.springboot.services;

import com.example.springboot.model.Programmer;
import com.example.springboot.repository.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProgrammerServiceImp implements ProgrammerService {

    @Autowired
    ProgrammerRepository programmerRepository;

    @Override
    public Programmer createProgrammer(Programmer programmer) {
        return programmerRepository.save(programmer);
    }

    @Transactional
    @Override
    public List<Programmer> getAllProgrammer() {
        List<Programmer> programmers = programmerRepository.findAll();
        return programmers;
    }
//
//    @Transactional
//    @Override
//    public String deleteProgrammerById(int programmerId) {
//        String str = null;
//        try {
//            programmerRepository.deleteById(programmerId);
//            str = "Deleted Successfully";
//        } catch (Exception e) {
//            str = "Deleted Unsuccessfully";
//        }
//        return str;
//    }
}