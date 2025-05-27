package com.bamboo.cursosdeestudiante.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id"
)
@Entity
@Table(name = "Reporte_Cursos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ReporteCurso extends Reporte {
    @OneToOne
    @JoinColumn(name = "curso_id", referencedColumnName = "id", nullable = false, unique = true)
    private Curso curso;

    @Column(nullable = false)
    private int total_inscritos;

    @Column(nullable = false)
    private double promedio_progreso;

    @Column(nullable = false)
    private double tasa_finalizacion;
}
