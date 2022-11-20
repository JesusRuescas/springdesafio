package com.five.springdesafio.model.clinica;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Medico")
public class Medico extends Usuario {

    // @Length(min = 5, max = 5)
    public String crm;

    public Medico() {
    }

    public Medico(@Size(min = 5, max = 5) String crm, @Size(min = 1, max = 45) String nome,
            @Size(min = 11, max = 11) String cpf, Date nascimento,
            @Size(min = 1, max = 1) String sexo) {
        this.crm = crm;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

}