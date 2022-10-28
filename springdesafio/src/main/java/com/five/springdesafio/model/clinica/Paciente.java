package com.five.springdesafio.model.clinica;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Paciente")
public class Paciente extends Usuario {

    public Paciente() {
    }

    public Paciente(@Size(min = 1, max = 30) String nome, @Size(min = 11, max = 11) String cpf, String nascimento,
            @Size(min = 1, max = 1) String sexo) {
        super(nome, cpf, nascimento, sexo);
    }

    

}
