package com.akeed.microservices.krishtutorial.controllers;

import com.akeed.microservices.krishtutorial.models.Student;
import com.akeed.microservices.krishtutorial.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@RestController
public class DemoController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String greetUser(){
        return "<h1> Hello User! </h1>";
    }

    @PostMapping("/")
    public String greetUser2(){
        return "<h1> Hello thanks for posting! </h1>";
    }

    @PostMapping("/student")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/students")
    public ArrayList<Student> retrieve(){
        return studentService.getStudents();
    }

    /*@GetMapping("/student/{userId}")
    public ResponseEntity<Student> findStudent(@PathVariable("userId") Integer userId){
        Student student = studentService.findStudent(userId);
        if(student==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(student);
    }*/

    @GetMapping("/student")
    public ResponseEntity<Student> findStudent(@RequestParam("userId") Integer userId){
        Student student = studentService.findStudent(userId);
        if(student==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(student);
    }

    @DeleteMapping("/student/{userId}")
    public void deleteOne(@PathVariable("userId") Integer userId){
        studentService.deleteStudent(userId);
    }

    @DeleteMapping("/student")
    public void deleteAll(){
        studentService.deleteAll();
    }



}
