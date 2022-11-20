package com.five.springdesafio.dto.atendimento;

import java.sql.Date;

import com.five.springdesafio.dto.medico.MedicoDTO;
import com.five.springdesafio.dto.paciente.PacienteDTO;

public class AtendimentoDTO {
    private Date data;
    private String observacao;
    private boolean ativo;
    public MedicoDTO medico;
    public PacienteDTO paciente;

    public AtendimentoDTO() {
    }

    public AtendimentoDTO(Date data, String observacao, boolean ativo, MedicoDTO medico, PacienteDTO paciente) {
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

    public MedicoDTO getMedico() {
        return medico;
    }

    public void setMedico(MedicoDTO medico) {
        this.medico = medico;
    }

    public PacienteDTO getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteDTO paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return medico.getCrm();
    }

}
