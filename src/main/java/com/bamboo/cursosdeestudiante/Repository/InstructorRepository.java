package com.bamboo.cursosdeestudiante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bamboo.cursosdeestudiante.Model.Instructor;



@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer>{
    
}
