package com.five.springdesafio.dto.atendimento;

import com.five.springdesafio.model.clinica.Medico;
import com.five.springdesafio.model.clinica.Paciente;

public class AtendimentoDTO {
    private long atendimentoId;
    private String data;
    private String observacao;
    private boolean ativo;
    Medico crm;
    Paciente cpf;
    
    public AtendimentoDTO(long atendimentoId, String data, String observacao, boolean ativo, Medico crm, Paciente cpf) {
        this.atendimentoId = atendimentoId;
        this.data = data;
        this.observacao = observacao;
        this.ativo = ativo;
        this.crm = crm;
        this.cpf = cpf;
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
