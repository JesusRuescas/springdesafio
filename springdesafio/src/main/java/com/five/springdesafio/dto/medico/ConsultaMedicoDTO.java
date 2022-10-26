package com.five.springdesafio.dto.medico;

import com.five.springdesafio.model.clinica.Medico;

public class ConsultaMedicoDTO {

    private String nome;
    private int crm;
    public ConsultaMedicoDTO(String nome, int crm) {
        this.nome = nome;
        this.crm = crm;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCrm() {
        return crm;
    }
    public void setCrm(int crm) {
        this.crm = crm;
    }


}
