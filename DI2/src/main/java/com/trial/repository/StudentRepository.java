package com.trial.repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("1Repo")
public class StudentRepository {

    public List<String> findAllStudents() {

        return Arrays.asList(
                "Sujan",
                "Rahul",
                "Priya"
        );
    }
}