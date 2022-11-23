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

import com.five.springdesafio.Service.AtendimentoService;
import com.five.springdesafio.dto.atendimento.AtendimentoDTO;
import com.five.springdesafio.dto.atendimento.RegistroAtendimentoDTO;

@RequestMapping(value = "/atendimento")
@RestController
public class AtendimentoController {

    @Autowired
    private AtendimentoService atendimentoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<AtendimentoDTO> cadastraAtendimento(
            @RequestBody RegistroAtendimentoDTO registroAtendimentoDTO) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(atendimentoService.criaAtendimeto(registroAtendimentoDTO));
    }

    @GetMapping
    public ResponseEntity<List<AtendimentoDTO>> buscaTodosAtendimentos() {
        return ResponseEntity.status(HttpStatus.OK).body(atendimentoService.listaAtendimetos());
    }
}