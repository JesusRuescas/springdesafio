package com.five.springdesafio.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.five.springdesafio.model.clinica.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    @Query("SELECT * FROM medico WHERE crm = ?1")
    Optional<Medico> findByCrm(String crm);

}