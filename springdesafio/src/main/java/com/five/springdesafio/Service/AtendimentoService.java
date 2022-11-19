package com.five.springdesafio.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.springdesafio.dto.atendimento.AtendimentoDTO;
import com.five.springdesafio.dto.atendimento.RegistroAtendimentoDTO;
import com.five.springdesafio.mapper.AtendimentoMapper;
import com.five.springdesafio.model.clinica.Atendimento;
import com.five.springdesafio.repository.AtendimentoRepository;

@Service
public class AtendimentoService {

    @Autowired
    AtendimentoRepository atendimentoRepository;

    @Autowired
    AtendimentoMapper atendimentoMapper;

    @Transactional
    public AtendimentoDTO criaAtendimento(RegistroAtendimentoDTO registroAtendimentoDTO) {
        Atendimento atendimentoModel = atendimentoMapper.model(registroAtendimentoDTO);
        atendimentoRepository.save(atendimentoModel);
        return atendimentoMapper.dto(atendimentoModel);
    }

    public List<AtendimentoDTO> listaAtendimentos() {
        List<Atendimento> atendimentos = atendimentoRepository.findAll();
        return atendimentoMapper.listDto(atendimentos);
    }

    public AtendimentoDTO listaPorId(Long id) {
        Atendimento atendimento = atendimentoRepository.findById(id).get();
        return atendimentoMapper.dto(atendimento);
    }

    @Transactional
    public AtendimentoDTO deletaAtendimento(Long id) {
        Atendimento atendimento = atendimentoRepository.findById(id).get();
        atendimentoRepository.delete(atendimento);
        return atendimentoMapper.dto(atendimento);
    }

    @Transactional
    public RegistroAtendimentoDTO atualizaAtendimento(Long id, RegistroAtendimentoDTO registroAtendimentoDTO) {
        Atendimento atendimento = atendimentoRepository.findById(id).get();
        atendimento = atendimentoMapper.AtualizaMapPutModel(registroAtendimentoDTO, atendimento);
        atendimentoRepository.save(atendimento);
        return atendimentoMapper.registroDTO(atendimento);
    }

    @Transactional
    public RegistroAtendimentoDTO atualizaParcialAtendimento(Long id, RegistroAtendimentoDTO registroAtendimentoDTO) {
        Atendimento atendimento = atendimentoRepository.findById(id).get();
        atendimento = atendimentoMapper.atualizaParcialMapModel(registroAtendimentoDTO, atendimento);
        atendimentoRepository.save(atendimento);
        return atendimentoMapper.registroDTO(atendimento);
    }

}