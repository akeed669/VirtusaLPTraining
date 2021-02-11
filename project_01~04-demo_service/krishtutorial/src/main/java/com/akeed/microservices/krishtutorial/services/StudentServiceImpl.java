package com.akeed.microservices.krishtutorial.services;

import com.akeed.microservices.krishtutorial.models.Student;
import com.akeed.microservices.krishtutorial.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public ArrayList<Student> getStudents() {
        return (ArrayList<Student>)studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Integer userId) {
       studentRepository.deleteById(userId);
    }

    @Override
    public void deleteAll() {
        studentRepository.deleteAll();
    }

    @Override
    public Student findStudent(Integer userId) {

        Optional<Student> student = studentRepository.findById(userId);
        if(student.isPresent()){
            return student.get();
        }

        return null;

    }

}

