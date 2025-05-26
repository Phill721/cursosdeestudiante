package com.bamboo.cursosdeestudiante.Model;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "Curso")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30, nullable = false)
    private String titulo;

    @Column(length = 200, nullable = false)
    private String descripcion;

    @Column(length = 50, nullable = false)
    private String categoria;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private NivelCurso nivel;

    @Column(nullable = false)
    private double precio;

    @Column(nullable = false)
    private int seccion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoCurso estado;

    @Column(nullable = false)
    private int cupo;

    @Transient
    private List<EstudianteDTO> inscritos;

    @Transient
    private List<ModuloDTO> modulos;

    @ElementCollection
    @CollectionTable(name = "cupones_curso", joinColumns = @JoinColumn(name = "curso_id"))
    @Column(name = "cupones")
    private List<String> cupones;


}
