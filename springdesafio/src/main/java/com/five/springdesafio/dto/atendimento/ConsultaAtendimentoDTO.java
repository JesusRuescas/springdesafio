package com.five.springdesafio.dto.atendimento;

import com.five.springdesafio.model.clinica.Medico;
import com.five.springdesafio.model.clinica.Paciente;

public class ConsultaAtendimentoDTO {
    private long atendimentoId;
    Medico crm;
    Paciente cpf;
    private boolean ativo;
    public ConsultaAtendimentoDTO(long atendimentoId, Medico crm, Paciente cpf, boolean ativo) {
        this.atendimentoId = atendimentoId;
        this.crm = crm;
        this.cpf = cpf;
        this.ativo = ativo;
    }
    public long getAtendimentoId() {
        return atendimentoId;
    }
    public void setAtendimentoId(long atendimentoId) {
        this.atendimentoId = atendimentoId;
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
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
   

    
}