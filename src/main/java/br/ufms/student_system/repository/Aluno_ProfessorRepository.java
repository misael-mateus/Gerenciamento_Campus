package br.ufms.student_system.repository;

import br.ufms.student_system.model.Aluno_Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Aluno_ProfessorRepository extends JpaRepository<Aluno_Professor, Long> {
}