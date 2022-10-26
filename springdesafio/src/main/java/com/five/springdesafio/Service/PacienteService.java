package com.five.springdesafio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.five.springdesafio.dto.paciente.PacienteDTO;
import com.five.springdesafio.dto.paciente.RegistroPacienteDTO;
import com.five.springdesafio.mapper.PacienteMapper;
import com.five.springdesafio.model.clinica.Paciente;
import com.five.springdesafio.repository.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    @Autowired
    PacienteMapper pacienteMapper;

    @Transactional
    public PacienteDTO atualizaPaciente(RegistroPacienteDTO registroPacienteDTO) {
        Paciente pacienteModel = pacienteMapper.registroModel(registroPacienteDTO);
        pacienteRepository.save(pacienteModel);
        return pacienteMapper.dto(pacienteModel);
    }

    public List<PacienteDTO> findAll() {
        return pacienteMapper.listDto(pacienteRepository.findAll());
    }
}
