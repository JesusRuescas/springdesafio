package com.five.springdesafio.mapper;

import java.util.List;

import org.mapstruct.MappingTarget;

import com.five.springdesafio.dto.atendimento.AtendimentoDTO;
import com.five.springdesafio.dto.atendimento.AtualizaAtendimentoDTO;
import com.five.springdesafio.dto.atendimento.ConsultaAtendimentoDTO;
import com.five.springdesafio.dto.atendimento.RegistroAtendimentoDTO;
import com.five.springdesafio.model.clinica.Atendimento;

public interface AtendimentoMapper {

    Atendimento model(AtendimentoDTO atendimentoDTO);
    AtendimentoDTO dto(Atendimento atendimento);
    Atendimento AtualizaMapPutModel(RegistroAtendimentoDTO registroAtendimentoDTO, @MappingTarget Atendimento atendimento);
    Atendimento registroModel(RegistroAtendimentoDTO registroAtendimentoDTO);
    RegistroAtendimentoDTO registroDTO(Atendimento atendimento);
    List<AtendimentoDTO> listDto(List<Atendimento> listAll);
    ConsultaAtendimentoDTO consultaDTO(Atendimento Atendimento);
    Atendimento atualizaParcialMapModel(AtualizaAtendimentoDTO atendimentoDTO, @MappingTarget Atendimento atendimento);
}

