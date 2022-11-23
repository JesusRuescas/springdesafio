package com.five.springdesafio.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.five.springdesafio.model.clinica.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, UUID> {
}
