package br.ufms.student_system.repository;

import br.ufms.student_system.model.Aluno_Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Aluno_DisciplinaRepository extends JpaRepository<Aluno_Disciplina, Long> {
}