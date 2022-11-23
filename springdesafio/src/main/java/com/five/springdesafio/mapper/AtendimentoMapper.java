package com.five.springdesafio.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.five.springdesafio.dto.atendimento.AtendimentoDTO;
import com.five.springdesafio.dto.atendimento.RegistroAtendimentoDTO;
import com.five.springdesafio.model.clinica.Atendimento;

@Mapper(componentModel = "spring")
public interface AtendimentoMapper {

        @Mapping(target = "medico", ignore = true)
        @Mapping(target = "paciente", ignore = true)
        @Mapping(target = "ativo", ignore = true)
        @Mapping(target = "id", ignore = true)
        Atendimento model(RegistroAtendimentoDTO registroAtendimentoDTO);

        @Mapping(target = "medicoId", ignore = true)
        @Mapping(target = "pacienteId", ignore = true)
        RegistroAtendimentoDTO registroDTO(Atendimento atendimento);

        @Mapping(target = "medico", ignore = true)
        @Mapping(target = "paciente", ignore = true)
        @Mapping(target = "ativo", ignore = true)
        @Mapping(target = "id", ignore = true)
        Atendimento AtualizaMapPutModel(RegistroAtendimentoDTO registroAtendimentoDTO,
                        @MappingTarget Atendimento atendimento);

        @Mapping(target = "id", ignore = true)
        Atendimento atualizaParcialMapModel(RegistroAtendimentoDTO registroAtendimentoDTO,
                        @MappingTarget Atendimento atendimento);

        @Mapping(target = "crm", source = "medico.crm")
        @Mapping(target = "cpf", source = "paciente.cpf")
        @Mapping(target = "id", source = "id")
        AtendimentoDTO dto(Atendimento atendimento);

        // ConsultaAtendimentoDTO consultaDTO(Atendimento atendimento);

        List<AtendimentoDTO> listDto(List<Atendimento> listAll);

        // @Mapping(target = "id", ignore = true)
        // @Mapping(target = "data", ignore = true)
        // Atendimento atualizaModel(AtualizaAtendimentoDTO atualizaAtendimentoDTO,
        // @MappingTarget Atendimento atendimento);
}