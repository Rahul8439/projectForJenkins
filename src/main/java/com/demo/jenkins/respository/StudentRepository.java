package com.demo.jenkins.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.jenkins.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
