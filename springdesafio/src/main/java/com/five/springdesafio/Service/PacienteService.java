package com.five.springdesafio.Service;

import java.util.List;
import java.util.Optional;

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
    public PacienteDTO criaPaciente(RegistroPacienteDTO registroPacienteDTO) {
        Paciente pacienteModel = pacienteMapper.registroModel(registroPacienteDTO);
        pacienteRepository.save(pacienteModel);
        return pacienteMapper.dto(pacienteModel);
    }

    public List<PacienteDTO> listaPacientes(String cpf) {
        List<Paciente> pacientes = pacienteRepository.findAll();
        return pacienteMapper.listDto(pacientes);
    }

    public PacienteDTO listaPorCpf(String cpf) {
        Paciente paciente = pacienteRepository.findByCpf(cpf).get();
        return pacienteMapper.dto(paciente);
    }

    @Transactional
    public PacienteDTO deletaPaciente(String cpf) {
        Paciente paciente = pacienteRepository.findByCpf(cpf).get();
        pacienteRepository.delete(paciente);
        return pacienteMapper.dto(paciente);
    }

    @Transactional
    public RegistroPacienteDTO atualizaPaciente(String cpf, RegistroPacienteDTO registroPacienteDTO) {
        Optional<Paciente> paciente = pacienteRepository.findByCpf(cpf);
        Paciente pacienteModel = paciente.orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
        pacienteModel = pacienteMapper.AtualizaMapPutModel(registroPacienteDTO, pacienteModel);
        pacienteRepository.save(pacienteModel);
        return pacienteMapper.registroDTO(pacienteModel);
    }

    @Transactional
    public RegistroPacienteDTO atualizaPacienteParcial(String cpf, RegistroPacienteDTO registroPacienteDTO) {
        Optional<Paciente> paciente = pacienteRepository.findByCpf(cpf);
        Paciente pacienteModel = paciente.orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
        pacienteModel = pacienteMapper.atualizaParcialMapModel(registroPacienteDTO, pacienteModel);
        pacienteRepository.save(pacienteModel);
        return pacienteMapper.registroDTO(pacienteModel);

    }
}
