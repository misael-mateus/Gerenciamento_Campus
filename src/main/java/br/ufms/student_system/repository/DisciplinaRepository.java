package br.ufms.student_system.repository;

import br.ufms.student_system.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
}
