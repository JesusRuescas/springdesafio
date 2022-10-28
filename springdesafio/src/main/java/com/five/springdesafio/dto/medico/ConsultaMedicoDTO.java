package com.five.springdesafio.dto.medico;

import com.five.springdesafio.model.clinica.Medico;

public class ConsultaMedicoDTO {

    private String nome;
    private String crm;

    public ConsultaMedicoDTO(){}
    public ConsultaMedicoDTO(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }


}
