package br.ufms.student_system.service;

import br.ufms.student_system.dto.CampusDto;
import br.ufms.student_system.model.Campus;
import br.ufms.student_system.repository.CampusRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CampusService {
    private final CampusRepository campusRepository;
    private final ModelMapper modelMapper;

    public CampusService(CampusRepository campusRepository, ModelMapper modelMapper) {
        this.campusRepository = campusRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public void save(CampusDto campusDto) {
        Campus campus = new Campus();
        this.modelMapper.map(campusDto, campus);
        campusRepository.save(campus);
    }

    @Transactional
    public CampusDto update(CampusDto campusDto, Long id) {
        Optional<Campus> campus = campusRepository.findById(id);
        if (campus.isPresent()) {
            this.modelMapper.map(campusDto, campus.get());
            campusRepository.save(campus.get());
            return campusDto;
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Campus não encontrado");
        }
    }

    @Transactional
    public void delete(Long id) {
        Optional<Campus> campus = campusRepository.findById(id);
        if (campus.isPresent()) {
            campusRepository.delete(campus.get());
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Campus não encontrado");
        }
    }

    public CampusDto findById(Long id) {
        Optional<Campus> campus = campusRepository.findById(id);
        if (campus.isPresent()) {
            CampusDto campusDto = new CampusDto();
            this.modelMapper.map(campus.get(), campusDto);
            return campusDto;
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Campus não encontrado");
        }
    }

    public Page<CampusDto> findAll(Pageable pageable) {
        Page<Campus> allCampus = campusRepository.findAll(pageable);
        return allCampus.map(campus -> modelMapper.map(campus, CampusDto.class));
    }
}
