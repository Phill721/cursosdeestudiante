package com.bamboo.cursosdeestudiante.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModuloDTO {
    private int id;
    private String titulo;
    private int orden;
}
