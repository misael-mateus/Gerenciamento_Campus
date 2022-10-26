package br.ufms.student_system.repository;

import br.ufms.student_system.model.Turma_Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Turma_DisciplinaRepository extends JpaRepository<Turma_Disciplina, Long> {
}