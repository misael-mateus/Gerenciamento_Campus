package br.ufms.student_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A DTO for the {@link br.ufms.student_system.model.Pessoa} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorDto implements Serializable {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String telefone;
    private String email;
    private String dataNascimento;
    private String sexo;
    private String nacionalidade;
    private String naturalidade;
    private String estadoCivil;
    private String nomePai;
    private String nomeMae;
    private String orgaoEmissor;
    private String dataEmissao;
    private String tituloEleitor;
    private String matricula;
    private BigDecimal salario;
    private String titulacao;
    private String areaAtuacao;
}