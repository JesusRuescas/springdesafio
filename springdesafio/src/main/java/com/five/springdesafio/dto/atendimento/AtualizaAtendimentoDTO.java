package com.five.springdesafio.dto.atendimento;

import java.sql.Date;

import com.five.springdesafio.model.clinica.Medico;
import com.five.springdesafio.model.clinica.Paciente;

public class AtualizaAtendimentoDTO {
    private Date data;
    private String observacao;
    private boolean ativo;
    public Medico medico;
    public Paciente paciente;

    public AtualizaAtendimentoDTO() {
    }

    public AtualizaAtendimentoDTO(Date data, String observacao, boolean ativo, Medico medico, Paciente paciente) {
        this.data = data;
        this.observacao = observacao;
        this.ativo = ativo;
        this.medico = medico;
        this.paciente = paciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return medico.getCrm();
    }

}

