package com.bamboo.cursosdeestudiante.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Instructor")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Instructor extends Usuario{
    @Column(length = 50, nullable = false)
    private String especialidad;

    @ManyToMany(mappedBy = "instructores")
    private List<Curso> cursos = new ArrayList<>();
}
