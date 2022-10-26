package br.ufms.student_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link br.ufms.student_system.model.Curso} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDto implements Serializable {
    private String nome;
    private String codigo;
    private Integer duracao;
}