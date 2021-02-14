package com.akeed.microservices.krishtutorial.repositories;

import com.akeed.microservices.krishtutorial.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
    //Student save(Student student);
}
