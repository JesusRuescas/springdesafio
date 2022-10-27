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

    Atendimento model(AtendimentoDTO atendimentoDTO);

    AtendimentoDTO dto(Atendimento atendimento);

    @Mapping(target = "atendimentoId", ignore = true)
    Atendimento AtualizaMapPutModel(RegistroAtendimentoDTO registroAtendimentoDTO,
            @MappingTarget Atendimento atendimento);

    @Mapping(target = "atendimentoId", ignore = true)
    Atendimento registroModel(RegistroAtendimentoDTO registroAtendimentoDTO);

    RegistroAtendimentoDTO registroDTO(Atendimento atendimento);

    List<AtendimentoDTO> listDto(List<Atendimento> listAll);

    @Mapping(target = "atendimentoId", ignore = true)

    ConsultaAtendimentoDTO consultaDTO(Atendimento atendimento);

    @Mapping(target = "atendimentoId", ignore = true)
    Atendimento atualizaParcialMapModel(AtualizaAtendimentoDTO atendimentoDTO, @MappingTarget Atendimento atendimento);
}
