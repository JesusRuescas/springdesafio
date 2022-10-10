package com.five.springdesafio.model.clinica;
import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Atendimento {
    protected static final long serialVersionUID = 1L;
    @Column(name = "AtendimentoId")
    protected long atendimentoId;
    protected String data;
    protected String observacao;
    protected boolean ativo;
    

    Medico medicoId;
    Paciente pacienteId;


    public Atendimento() {}

    public Atendimento(long atendimentoId, @JsonFormat(pattern = "dd-MM-yyy") String data, String observacao,
            boolean ativo, Medico medicoId, Paciente pacienteId) {
        this.atendimentoId = atendimentoId;
        this.data = data;
        this.observacao = observacao;
        this.ativo = ativo;
        this.medicoId = medicoId;
        this.pacienteId = pacienteId;
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

    public Medico getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Medico medicoId) {
        this.medicoId = medicoId;
    }

    public Paciente getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Paciente pacienteId) {
        this.pacienteId = pacienteId;
    }



    
}
