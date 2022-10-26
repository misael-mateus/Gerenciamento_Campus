package br.ufms.student_system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_campus")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String codigo;
    private Integer duracao;
    @OneToMany(mappedBy = "curso")
    private List<Professor> professores;
    @OneToMany(mappedBy = "curso")
    private List<Curso_Disciplina> disciplinas;
    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunos;
    @OneToMany(mappedBy = "curso")
    private List<Curso_Campus> campus;

}
