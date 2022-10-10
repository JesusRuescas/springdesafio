package com.five.springdesafio.dto;

import com.five.springdesafio.model.clinica.Medico;
import com.five.springdesafio.model.clinica.Paciente;

public class AtendimentoDTO {
    private long atendimentoId;
    private String data;
    private String observacao;
    private boolean ativo;
    Medico medicoId;
    Paciente pacienteId;

    public AtendimentoDTO() {}

    public AtendimentoDTO(long atendimentoId, String data, String observacao,
            boolean ativo, Medico medicoId, Paciente pacienteId) {
        this.atendimentoId = atendimentoId;
        this.data = data;
        this.observacao = observacao;
        this.ativo = ativo;
        this.medicoId = medicoId;
        this.pacienteId = pacienteId;
    }
    
    public AtendimentoDTO(AtendimentoDTO modelAtendimentoDTO){
        this.atendimentoId = modelAtendimentoDTO.getAtendimentoId();
        this.data = modelAtendimentoDTO.getData();
        this.observacao = modelAtendimentoDTO.getObservacao();
        this.ativo = modelAtendimentoDTO.isAtivo();
        this.medicoId = modelAtendimentoDTO.getMedicoId();
        this.pacienteId = modelAtendimentoDTO.getPacienteId();
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
