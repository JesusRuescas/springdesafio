package com.five.springdesafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.five.springdesafio.model.clinica.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}