package com.trial.service;

import com.trial.component.StudentValidator;
import com.trial.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("1Ser")
public class StudentService {

    private final StudentRepository repository;
    private final StudentValidator validator;

    public StudentService(
            StudentRepository repository,
            StudentValidator validator) {

        this.repository = repository;
        this.validator = validator;
    }

    public List<String> getStudents() {

        return repository.findAllStudents();
    }

    public String validateStudent(String name) {

        if (validator.isValid(name)) {
            return "Student name is valid";
        }

        return "Student name is invalid";
    }
}