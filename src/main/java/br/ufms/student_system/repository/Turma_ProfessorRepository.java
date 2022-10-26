package br.ufms.student_system.repository;

import br.ufms.student_system.model.Turma_Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Turma_ProfessorRepository extends JpaRepository<Turma_Professor, Long> {
}