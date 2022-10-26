package br.ufms.student_system.repository;

import br.ufms.student_system.model.Professor_Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Professor_DisciplinaRepository extends JpaRepository<Professor_Disciplina, Long> {
}