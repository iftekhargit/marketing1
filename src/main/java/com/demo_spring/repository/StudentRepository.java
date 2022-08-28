package com.demo_spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo_spring.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
