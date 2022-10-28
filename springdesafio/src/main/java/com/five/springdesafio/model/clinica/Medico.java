package com.five.springdesafio.model.clinica;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Medico")
public class Medico extends Usuario {

    // @Length(min = 5, max = 5)
    public String crm;
    
    public Medico() {}

    public Medico(String crm) {
        this.crm = crm;
    }


    public Medico(@Size(min = 1, max = 30) String nome, @Size(min = 11, max = 11) String cpf, String nascimento,
            @Size(min = 1, max = 1) String sexo, String crm) {
        super(nome, cpf, nascimento, sexo);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    

}