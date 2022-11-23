package com.five.springdesafio.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.five.springdesafio.dto.medico.MedicoDTO;
import com.five.springdesafio.dto.medico.RegistroMedicoDTO;
import com.five.springdesafio.mapper.MedicoMapper;
import com.five.springdesafio.model.clinica.Medico;
import com.five.springdesafio.repository.MedicoRepository;

@Service
public class MedicoService {

    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    MedicoMapper medicoMapper;

    @Transactional
    public MedicoDTO criaMedico(RegistroMedicoDTO registroMedicoDTO) {
        Medico medicoModel = medicoMapper.registroModel(registroMedicoDTO);
        medicoRepository.save(medicoModel);
        return medicoMapper.dto(medicoModel);
    }

    public List<MedicoDTO> listaMedicos(String crm) {
        List<Medico> medicos = medicoRepository.findAll();
        return medicoMapper.listDto(medicos);
    }

    @Transactional
    public MedicoDTO deletaMedico(String crm) {
        Medico medico = medicoRepository.findByCrm(crm).get();
        medicoRepository.delete(medico);
        return medicoMapper.dto(medico);
    }

    @Transactional
    public RegistroMedicoDTO atualizaMedico(String crm, RegistroMedicoDTO registroMedicoDTO) {
        Optional<Medico> medico = medicoRepository.findByCrm(crm);
        Medico medicoModel = medico.orElseThrow(() -> new RuntimeException("Médico não encontrado"));
        medicoModel = medicoMapper.AtualizaMapPutModel(registroMedicoDTO, medicoModel);
        medicoRepository.save(medicoModel);
        return medicoMapper.registroDTO(medicoModel);
    }

    @Transactional
    public RegistroMedicoDTO atualizaMedicoParcial(String crm, RegistroMedicoDTO registroMedicoDTO) {
        Optional<Medico> medico = medicoRepository.findByCrm(crm);
        Medico medicoModel = medico.orElseThrow(() -> new RuntimeException("Médico não encontrado"));
        medicoModel = medicoMapper.atualizaParcialMapModel(registroMedicoDTO, medicoModel);
        medicoRepository.save(medicoModel);
        return medicoMapper.registroDTO(medicoModel);

    }
}