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
public class Campus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cidade;
    private String estado;
    @OneToMany(mappedBy = "campus")
    private List<Curso_Campus> cursos;
    @OneToMany
    private List<Professor> professores;
    @OneToMany
    private List<Aluno> alunos;
    @OneToMany
    private List<Turma> turmas;
    @OneToMany(mappedBy = "campus")
    private List<Campus_Disciplina> disciplinas;
}
