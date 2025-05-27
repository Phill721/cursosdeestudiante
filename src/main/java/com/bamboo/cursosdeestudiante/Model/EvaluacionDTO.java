package com.bamboo.cursosdeestudiante.Model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EvaluacionDTO {
    private int id;
    private List<CalificacionDTO> calificacion;
}
