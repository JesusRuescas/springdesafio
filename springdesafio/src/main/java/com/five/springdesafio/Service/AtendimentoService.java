package com.five.springdesafio.Service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.springdesafio.dto.atendimento.AtendimentoDTO;
import com.five.springdesafio.dto.atendimento.RegistroAtendimentoDTO;
import com.five.springdesafio.mapper.AtendimentoMapper;
import com.five.springdesafio.model.clinica.Atendimento;
import com.five.springdesafio.model.clinica.Medico;
import com.five.springdesafio.model.clinica.Paciente;
import com.five.springdesafio.repository.AtendimentoRepository;
import com.five.springdesafio.repository.MedicoRepository;
import com.five.springdesafio.repository.PacienteRepository;

@Service
public class AtendimentoService {
    @Autowired
    AtendimentoRepository atendimentoRepository;

    @Autowired
    AtendimentoMapper atendimentoMapper;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Transactional
    public AtendimentoDTO criaAtendimeto(RegistroAtendimentoDTO registroAtendimentoDTO) {
        Medico medicoId = medicoRepository.findById(registroAtendimentoDTO.getMedicoId()).orElseThrow();
        Paciente pacienteId = pacienteRepository.findById(registroAtendimentoDTO.getPacienteId()).orElseThrow();
        Atendimento atendimento = atendimentoMapper.model(registroAtendimentoDTO);
        atendimento.setMedico(medicoId);
        atendimento.setPaciente(pacienteId);
        atendimentoRepository.save(atendimento);

        return atendimentoMapper.dto(atendimento);
    }

    public List<AtendimentoDTO> listaAtendimetos() {
        List<Atendimento> atendimentos = atendimentoRepository.findAll();
        return atendimentoMapper.listDto(atendimentos);
    }

    public AtendimentoDTO findById(UUID id) {
        Atendimento atendimento = atendimentoRepository.findById(id).get();
        return atendimentoMapper.dto(atendimento);
    }

    @Transactional
    public RegistroAtendimentoDTO atualizaAtendimento(UUID id,
            RegistroAtendimentoDTO registroAtendimentoDTO) {
        Atendimento atendimento = atendimentoRepository.findById(id).get();
        atendimento = atendimentoMapper.AtualizaMapPutModel(registroAtendimentoDTO,
                atendimento);
        atendimentoRepository.save(atendimento);
        return atendimentoMapper.registroDTO(atendimento);
    }

    @Transactional
    public RegistroAtendimentoDTO atualizaAtendimentoParcial(UUID id,
            RegistroAtendimentoDTO registroAtendimentoDTO) {
        Atendimento atendimento = atendimentoRepository.findById(id).get();
        atendimento = atendimentoMapper.atualizaParcialMapModel(registroAtendimentoDTO,
                atendimento);
        atendimentoRepository.save(atendimento);
        return atendimentoMapper.registroDTO(atendimento);
    }

    @Transactional
    public void delete(UUID id) {
        atendimentoRepository.deleteById(id);
    }
}