package com.mjnari.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.mjnari.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
