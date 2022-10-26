package br.ufms.student_system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pessoa {
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
}
