package com.five.springdesafio.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.five.springdesafio.model.clinica.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    @Query("SELECT * FROM Paciente WHERE cpf = ?1")
    Optional<Paciente> findByCpf(String cpf);

}