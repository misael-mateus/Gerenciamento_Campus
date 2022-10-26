package br.ufms.student_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link br.ufms.student_system.model.Turma} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurmaDto implements Serializable {
    private String nome;
    private String semestre;
    private String ano;
    private String turno;
    private String sala;
    private LocalDateTime horario;
}