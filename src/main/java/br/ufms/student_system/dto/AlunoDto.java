package br.ufms.student_system.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link br.ufms.student_system.model.Aluno} entity
 */
@Data
public class AlunoDto implements Serializable {
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
    private String semestre;
    private String coeficienteDeRendimento;
}