package com.trial.controller;

import com.trial.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("1Res")
@RequestMapping("/")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public String index() {
        return "Hello World";
    }

    @GetMapping("/students")
    public List<String> getStudents() {

        return service.getStudents();
    }

    @GetMapping("/validate")
    public String validateStudent(@RequestParam String name) {

        return service.validateStudent(name);
    }
}