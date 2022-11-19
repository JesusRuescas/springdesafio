package com.five.springdesafio.dto.atendimento;

import com.five.springdesafio.model.clinica.Medico;
import com.five.springdesafio.model.clinica.Paciente;

public class ConsultaAtendimentoDTO {
    public Medico medico;
    public Paciente paciente;
    private boolean ativo;

    public ConsultaAtendimentoDTO(){}

    public ConsultaAtendimentoDTO(Medico medico, Paciente paciente, boolean ativo) {
        this.medico = medico;
        this.paciente = paciente;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    @Override
    public String toString() {
        return medico.getCrm();
    }
    
    
}