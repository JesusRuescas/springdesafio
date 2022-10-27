package com.five.springdesafio.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.five.springdesafio.dto.paciente.AtualizaPacienteDTO;
import com.five.springdesafio.dto.paciente.ConsultaPacienteDTO;
import com.five.springdesafio.dto.paciente.PacienteDTO;
import com.five.springdesafio.dto.paciente.RegistroPacienteDTO;
import com.five.springdesafio.model.clinica.Paciente;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PacienteMapper {

    @Mapping(target = "id", ignore = true)
    Paciente model(PacienteDTO pacienteDTO);

    PacienteDTO dto(Paciente paciente);

    @Mapping(target = "id", ignore = true)
    Paciente AtualizaMapPutModel(RegistroPacienteDTO registroPacienteDTO, @MappingTarget Paciente paciente);

    @Mapping(target = "id", ignore = true)
    Paciente registroModel(RegistroPacienteDTO registroPacienteDTO);

    RegistroPacienteDTO registroDTO(Paciente paciente);

    List<PacienteDTO> listDto(List<Paciente> listAll);

    ConsultaPacienteDTO consultaDTO(Paciente paciente);

    @Mapping(target = "id", ignore = true)
    Paciente atualizaParcialMapModel(AtualizaPacienteDTO pacienteDTO, @MappingTarget Paciente paciente);
}
