package com.five.springdesafio.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public MedicoDTO atualizaMedico(RegistroMedicoDTO registroMedicoDTO) {
        Medico MedicoModel = medicoMapper.registroModel(registroMedicoDTO);
        medicoRepository.save(MedicoModel);
        return medicoMapper.dto(MedicoModel);
    }

    public List<MedicoDTO> findAll() {
        return medicoMapper.listDto(medicoRepository.findAll());
    }

}