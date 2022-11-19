package com.five.springdesafio.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.five.springdesafio.dto.atendimento.AtendimentoDTO;
import com.five.springdesafio.dto.atendimento.AtualizaAtendimentoDTO;
import com.five.springdesafio.dto.atendimento.ConsultaAtendimentoDTO;
import com.five.springdesafio.dto.atendimento.RegistroAtendimentoDTO;
import com.five.springdesafio.model.clinica.Atendimento;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AtendimentoMapper {

    @Mapping(target = "id", ignore = true)
    Atendimento model(RegistroAtendimentoDTO registroAtendimentoDTO);

    RegistroAtendimentoDTO registroDTO(Atendimento atendimento);

    @Mapping(target = "id", ignore = true)
    Atendimento AtualizaMapPutModel(RegistroAtendimentoDTO registroAtendimentoDTO,
            @MappingTarget Atendimento atendimento);

    @Mapping(target = "id", ignore = true)
    Atendimento atualizaParcialMapModel(RegistroAtendimentoDTO registroAtendimentoDTO,
            @MappingTarget Atendimento atendimento);

    AtendimentoDTO dto(Atendimento atendimento);

    ConsultaAtendimentoDTO consultaDTO(Atendimento atendimento);

    List<AtendimentoDTO> listDto(List<Atendimento> listAll);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "data", ignore = true)
    Atendimento atualizaModel(AtualizaAtendimentoDTO atualizaAtendimentoDTO, @MappingTarget Atendimento atendimento);

}