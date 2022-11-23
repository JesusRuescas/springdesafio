package com.five.springdesafio.dto.atendimento;

import java.sql.Date;
import java.util.UUID;

import com.five.springdesafio.model.clinica.Medico;
import com.five.springdesafio.model.clinica.Paciente;

public class RegistroAtendimentoDTO {
    private Date data;
    private String observacao;
    private boolean ativo;
    private Medico medico;
    private Paciente paciente;
    private UUID pacienteId;
    private UUID medicoId;

    public RegistroAtendimentoDTO() {
    }

    public RegistroAtendimentoDTO(Date data, String observacao, boolean ativo, Medico medico, Paciente paciente,
            UUID pacienteId, UUID medicoId) {
        this.data = data;
        this.observacao = observacao;
        this.ativo = ativo;
        this.medico = medico;
        this.paciente = paciente;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
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

    public UUID getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(UUID pacienteId) {
        this.pacienteId = pacienteId;
    }

    public UUID getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(UUID medicoId) {
        this.medicoId = medicoId;
    }

}
