package br.ufms.student_system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_aluno_disciplina")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno_Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Aluno aluno;
    @ManyToOne
    private Disciplina disciplina;
}
