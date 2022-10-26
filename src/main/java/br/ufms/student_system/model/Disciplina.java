package br.ufms.student_system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_disciplina")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String codigo;
    private String cargaHoraria;
    private String ementa;
    private String bibliografia;
    @OneToMany
    private List<Disciplina> preRequisitos;
    @OneToMany(mappedBy = "disciplina")
    private List<Professor_Disciplina> professores;
    @OneToMany(mappedBy = "disciplina")
    private List<Turma_Disciplina> turmas;
    @OneToMany(mappedBy = "disciplina")
    private List<Aluno_Disciplina> alunos;
    @OneToMany(mappedBy = "disciplina")
    private List<Curso_Disciplina> cursos;
    @OneToMany(mappedBy = "disciplina")
    private List<Campus_Disciplina> campus;

}
