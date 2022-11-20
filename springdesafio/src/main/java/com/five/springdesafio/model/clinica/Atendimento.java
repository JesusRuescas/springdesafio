package com.five.springdesafio.model.clinica;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Atendimento {

    protected static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "atendimento_id", updatable = false, unique = true, nullable = false)
    public UUID id;

    @DateTimeFormat(pattern = "dd-MM-yyyy-HH:mm")
    @JsonFormat(pattern = "dd-MM-yyyy-HH:mm")
    protected LocalDate data;

    protected String observacao;
    protected boolean ativo;

    @ManyToOne(fetch = FetchType.LAZY)
    private Medico medico;
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    public Atendimento() {
    }

    public Atendimento(UUID id, LocalDate data, String observacao, boolean ativo, Medico medico, Paciente paciente) {
        this.id = id;
        this.data = data;
        this.observacao = observacao;
        this.ativo = ativo;
        this.medico = medico;
        this.paciente = paciente;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate localDate) {
        this.data = localDate;
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

    // @OneToMany(fetch = FetchType.LAZY)
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

}
