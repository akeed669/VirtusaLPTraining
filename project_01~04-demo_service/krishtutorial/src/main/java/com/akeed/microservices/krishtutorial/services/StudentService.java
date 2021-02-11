package com.akeed.microservices.krishtutorial.services;

import com.akeed.microservices.krishtutorial.models.Student;

import java.util.ArrayList;
import java.util.Optional;

public interface StudentService {

    Student save(Student student);

    ArrayList<Student> getStudents();

    void deleteStudent(Integer userId);

    void deleteAll();

    Student findStudent(Integer userId);
}
