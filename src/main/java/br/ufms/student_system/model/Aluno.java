package br.ufms.student_system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_aluno")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String semestre;
    private String coeficienteDeRendimento;
    @OneToMany(mappedBy = "aluno")
    private List<Aluno_Professor> professor;
    @OneToMany(mappedBy = "aluno")
    private List<Aluno_Disciplina> disciplinas;
    @ManyToOne
    private Turma turma;
    @ManyToOne
    private Curso curso;
}
