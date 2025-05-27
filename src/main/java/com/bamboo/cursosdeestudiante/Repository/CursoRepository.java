package com.bamboo.cursosdeestudiante.Repository;

import org.springframework.stereotype.Repository;

import com.bamboo.cursosdeestudiante.Model.Curso;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{
    
}
