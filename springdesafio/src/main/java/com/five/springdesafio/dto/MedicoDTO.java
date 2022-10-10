package com.five.springdesafio.dto;

import com.five.springdesafio.model.clinica.Medico;

public class MedicoDTO {

    private long medicoId;
    private String nome;
    private int crm;

    public MedicoDTO() {
    }

    public MedicoDTO(long medicoId, String nome, int crm) {
        this.medicoId = medicoId;
        this.nome = nome;
        this.crm = crm;
    }
    public MedicoDTO(Medico modelMedico) {
        this.medicoId = modelMedico.getMedicoId();
        this.nome = modelMedico.getNome();
        this.crm = modelMedico.getCrm();
    }

    public long getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(long medicoId) {
        this.medicoId = medicoId;
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
