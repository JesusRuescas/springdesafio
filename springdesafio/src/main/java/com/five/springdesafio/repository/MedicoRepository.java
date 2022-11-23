package com.five.springdesafio.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.five.springdesafio.model.clinica.Medico;

public interface MedicoRepository extends JpaRepository<Medico, UUID> {
    Optional<Medico> findByCrm(String crm);
}