package br.ufms.student_system.repository;

import br.ufms.student_system.model.Curso_Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Curso_DisciplinaRepository extends JpaRepository<Curso_Disciplina, Long> {
}