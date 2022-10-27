package com.five.springdesafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.five.springdesafio.Service.PacienteService;
import com.five.springdesafio.dto.paciente.PacienteDTO;
import com.five.springdesafio.dto.paciente.RegistroPacienteDTO;

@RequestMapping(value = "/paciente")
@RestController
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PacienteDTO> atualizaPaciente(@RequestBody RegistroPacienteDTO registroPacienteDTO) {
        pacienteService.atualizaPaciente(registroPacienteDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(pacienteService.atualizaPaciente(registroPacienteDTO));
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<PacienteDTO>> listaPacientes() {
        List<PacienteDTO> pacientes = pacienteService.listaPacientes();
        return ResponseEntity.status(HttpStatus.OK).body(pacientes);
    }
}