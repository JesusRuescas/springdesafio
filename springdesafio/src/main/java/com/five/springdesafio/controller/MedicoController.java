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

import com.five.springdesafio.Service.MedicoService;
import com.five.springdesafio.dto.medico.MedicoDTO;
import com.five.springdesafio.dto.medico.RegistroMedicoDTO;

@RequestMapping(value = "/medico")
@RestController
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<MedicoDTO> atualizaMedico(@RequestBody RegistroMedicoDTO registroMedicoDTO) {
        medicoService.atualizaMedico(registroMedicoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(medicoService.atualizaMedico(registroMedicoDTO));
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<MedicoDTO>> listaMedicos() {
        List<MedicoDTO> medicos = medicoService.listaMedicos();
        return ResponseEntity.status(HttpStatus.OK).body(medicos);
    }
}