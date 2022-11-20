package com.five.springdesafio.model.clinica;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Paciente")
public class Paciente extends Usuario {

    public Paciente() {
    }

    public Paciente(@Size(min = 1, max = 30) String nome, @Size(min = 11, max = 11) String cpf, Date nascimento,
            @Size(min = 1, max = 1) String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

}
