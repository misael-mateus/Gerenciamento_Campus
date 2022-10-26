package br.ufms.student_system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_campus_disciplina")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Campus_Disciplina {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Campus campus;
    @ManyToOne
    private Disciplina disciplina;

}
