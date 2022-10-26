package br.ufms.student_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link br.ufms.student_system.model.Campus} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CampusDto implements Serializable {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cidade;
    private String estado;
}