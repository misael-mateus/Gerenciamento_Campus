package br.ufms.student_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link br.ufms.student_system.model.Disciplina} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisciplinaDto implements Serializable {
    private String nome;
    private String codigo;
    private String cargaHoraria;
    private String ementa;
    private String bibliografia;
}