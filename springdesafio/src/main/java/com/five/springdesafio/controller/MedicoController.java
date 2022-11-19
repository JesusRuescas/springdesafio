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
    public ResponseEntity<MedicoDTO> cadastraMedico(@RequestBody RegistroMedicoDTO registroMedicoDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(medicoService.criaMedico(registroMedicoDTO));
    }

    @GetMapping
    public ResponseEntity<List<MedicoDTO>> buscaMedicos(@RequestParam String crm) {
        return ResponseEntity.status(HttpStatus.OK).body(medicoService.listaMedicos(crm));
    }
    
    // // @GetMapping(value = "/{crm}")
    // public ResponseEntity<MedicoDTO> buscaMedicoPorCrm(@RequestParam() String crm) {
    //     return ResponseEntity.status(HttpStatus.OK).body(medicoService.listaPorCrm(crm));
    // }


    @PutMapping(value = "/{crm}")
    public ResponseEntity<RegistroMedicoDTO> atualizaMedico(@PathVariable String crm,
            @Valid @RequestBody RegistroMedicoDTO registroMedicoDTO) {
        RegistroMedicoDTO medico = medicoService.atualizaMedico(crm, registroMedicoDTO);
        return ResponseEntity.ok().body(medico);
    }

    @PatchMapping(value = "/{crm}")
    public ResponseEntity<RegistroMedicoDTO> atualizaMedicoParcial(@PathVariable String crm,
            @Valid @RequestBody RegistroMedicoDTO registroMedicoDTO) {
        RegistroMedicoDTO medico = medicoService.atualizaMedicoParcial(crm, registroMedicoDTO);
        return ResponseEntity.ok().body(medico);
    }

    @DeleteMapping(value = "/{crm}")
    public ResponseEntity<MedicoDTO> deletaMedico(@PathVariable String crm) {
        return ResponseEntity.ok().body(medicoService.deletaMedico(crm));
    }

}