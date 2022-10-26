package br.ufms.student_system.repository;

import br.ufms.student_system.model.Campus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampusRepository extends JpaRepository<Campus, Long> {

}
