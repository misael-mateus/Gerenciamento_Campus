package br.ufms.student_system.service;

import org.springframework.stereotype.Service;

@Service
public class FacadeService {

    private final AlunoService alunoService;
    private final CursoService cursoService;
    private final DisciplinaService disciplinaService;
    private final ProfessorService professorService;
    private final CampusService campusService;
    private final TurmaService turmaService;

    public FacadeService(AlunoService alunoService, CursoService cursoService, DisciplinaService disciplinaService, ProfessorService professorService, CampusService campusService, TurmaService turmaService) {
        this.alunoService = alunoService;
        this.cursoService = cursoService;
        this.disciplinaService = disciplinaService;
        this.professorService = professorService;
        this.campusService = campusService;
        this.turmaService = turmaService;
    }




}
