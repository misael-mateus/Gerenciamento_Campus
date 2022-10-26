package br.ufms.student_system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_turma")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String semestre;
    private String ano;
    private String turno;
    private String sala;
    private LocalDateTime horario;
    @OneToMany(mappedBy = "turma")
    private List<Turma_Professor> professores;
    @OneToMany(mappedBy = "turma")
    private List<Turma_Disciplina> disciplinas;
    @OneToMany(mappedBy = "turma")
    private List<Aluno> alunos;
    @ManyToOne
    private Curso curso;
}
