package com.five.springdesafio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    public ResponseEntity<PacienteDTO> cadastraPaciente(@RequestBody RegistroPacienteDTO registroPacienteDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pacienteService.criaPaciente(registroPacienteDTO));
    }

    @GetMapping
    public ResponseEntity<List<PacienteDTO>> buscaTodosPacientes(@RequestParam String cpf) {
        return ResponseEntity.status(HttpStatus.OK).body(pacienteService.listaPacientes(cpf));
    }

    // @GetMapping
    // public ResponseEntity<List<MedicoDTO>> buscaMedicos(@RequestParam String crm) {
    //     return ResponseEntity.status(HttpStatus.OK).body(medicoService.listaMedicos(crm));
    // }
    
    //  @GetMapping
    // public ResponseEntity<List<MedicoDTO>> buscaMedicos(@RequestParam String crm) {
    //     return ResponseEntity.status(HttpStatus.OK).body(medicoService.listaMedicos(crm));
    // }



    @PutMapping(value = "/{cpf}")
    public ResponseEntity<RegistroPacienteDTO> atualizaPaciente(@PathVariable String cpf,
            @Valid @RequestBody RegistroPacienteDTO registroPacienteDTO) {
        RegistroPacienteDTO paciente = pacienteService.atualizaPaciente(cpf, registroPacienteDTO);
        return ResponseEntity.ok().body(paciente);
    }

    @PatchMapping(value = "/{cpf}")
    public ResponseEntity<RegistroPacienteDTO> atualizaPacienteParcial(@PathVariable String cpf,
            @Valid @RequestBody RegistroPacienteDTO registroPacienteDTO) {
        RegistroPacienteDTO paciente = pacienteService.atualizaPacienteParcial(cpf, registroPacienteDTO);
        return ResponseEntity.ok().body(paciente);
    }

    @DeleteMapping(value = "/{cpf}")
    public ResponseEntity<PacienteDTO> deletaPaciente(@PathVariable String cpf) {
        return ResponseEntity.ok().body(pacienteService.deletaPaciente(cpf));
    }
}