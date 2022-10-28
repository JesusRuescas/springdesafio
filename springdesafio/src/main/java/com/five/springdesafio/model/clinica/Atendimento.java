package com.five.springdesafio.model.clinica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Atendimento {

    protected static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Atendimento_id")
    protected long atendimentoId;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    protected String data;

    protected String observacao;
    protected boolean ativo;

    @OneToOne
    Medico crm;
    
    @OneToOne
    Paciente cpf;

    public Atendimento() {}
    public Atendimento(long atendimentoId, String data, String observacao, boolean ativo, Medico crm, Paciente cpf) {
        this.atendimentoId = atendimentoId;
        this.data = data;
        this.observacao = observacao;
        this.ativo = ativo;
        this.crm = crm;
        this.cpf = cpf;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getAtendimentoId() {
        return atendimentoId;
    }

    public void setAtendimentoId(long atendimentoId) {
        this.atendimentoId = atendimentoId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Medico getCrm() {
        return crm;
    }

    public void setCrm(Medico crm) {
        this.crm = crm;
    }

    public Paciente getCpf() {
        return cpf;
    }

    public void setCpf(Paciente cpf) {
        this.cpf = cpf;
    }

    
}
