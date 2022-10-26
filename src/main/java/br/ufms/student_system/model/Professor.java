package br.ufms.student_system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tb_professor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Professor extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricula;
    private BigDecimal salario;
    private String titulacao;
    private String areaAtuacao;
    @OneToMany(mappedBy = "professor")
    private List<Professor_Disciplina> disciplinas;
    @OneToMany(mappedBy = "professor")
    private List<Turma_Professor> turmas;
    @OneToMany(mappedBy = "professor")
    private List<Aluno_Professor> alunos;
    @ManyToOne
    private Curso curso;
}
