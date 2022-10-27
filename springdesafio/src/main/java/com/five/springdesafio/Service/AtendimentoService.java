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
    public AtendimentoDTO atualizaAtendimento(RegistroAtendimentoDTO registroAtendimentoDTO) {
        Atendimento atendimentoModel = atendimentoMapper.registroModel(registroAtendimentoDTO);
        atendimentoRepository.save(atendimentoModel);
        return atendimentoMapper.dto(atendimentoModel);
    }

    public List<AtendimentoDTO> listaAtenidmentos() {
        return atendimentoMapper.listDto(atendimentoRepository.findAll());
    }

}