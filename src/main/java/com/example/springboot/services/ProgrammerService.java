package com.example.springboot.services;

import com.example.springboot.model.Programmer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProgrammerService {
    Programmer createProgrammer(Programmer programmer);

    List<Programmer> getAllProgrammer();

//    String deleteProgrammerById(int programmerId);
}