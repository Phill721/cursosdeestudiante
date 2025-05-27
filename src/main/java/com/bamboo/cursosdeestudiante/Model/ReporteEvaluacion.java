package com.bamboo.cursosdeestudiante.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Reporte_Evaluaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ReporteEvaluacion extends Reporte {
    @Transient
    private EvaluacionDTO evaluacion;

    @Column
    private double promedio_calificaciones;

    @Column
    private double tasadeaprobacion;

    @Column(nullable = false)
    private int evaluacionid;

}
