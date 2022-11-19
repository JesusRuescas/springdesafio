package com.five.springdesafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.five.springdesafio.model.clinica.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {

}
