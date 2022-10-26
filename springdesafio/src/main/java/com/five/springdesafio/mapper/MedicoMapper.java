package com.five.springdesafio.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.five.springdesafio.dto.medico.AtualizaMedicoDTO;
import com.five.springdesafio.dto.medico.ConsultaMedicoDTO;
import com.five.springdesafio.dto.medico.MedicoDTO;
import com.five.springdesafio.dto.medico.RegistroMedicoDTO;
import com.five.springdesafio.model.clinica.Medico;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface MedicoMapper {

    @Mapping(target = "id", ignore = true)
    Medico model(MedicoDTO medicoDTO);

    MedicoDTO dto(Medico medico);

    @Mapping(target = "id", ignore = true)
    Medico AtualizaMapPutModel(RegistroMedicoDTO registroMedicoDTO, @MappingTarget Medico medico);

    @Mapping(target = "id", ignore = true)
    Medico registroModel(RegistroMedicoDTO registroMedicoDTO);

    RegistroMedicoDTO registroDTO(Medico medico);

    List<MedicoDTO> listDto(List<Medico> listAll);

    ConsultaMedicoDTO consultaDTO(Medico medico);

    @Mapping(target = "id", ignore = true)
    Medico atualizaParcialMapModel(AtualizaMedicoDTO medicoDTO, @MappingTarget Medico medico);
}
