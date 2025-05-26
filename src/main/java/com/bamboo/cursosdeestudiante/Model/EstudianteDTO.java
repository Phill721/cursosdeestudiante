package com.bamboo.cursosdeestudiante.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteDTO {
    private int id;
    private String correo;
    private String usuario;
}
