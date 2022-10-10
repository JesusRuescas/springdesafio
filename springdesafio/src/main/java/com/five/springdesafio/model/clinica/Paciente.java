package com.five.springdesafio.model.clinica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Paciente")
public class Paciente extends Usuario {
    protected static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PacienteId")
    public long pacienteId;

    public Paciente() {
    }

    public Paciente(long pacienteId, @Length(min = 1, max = 30) String nome, @Length(min = 11, max = 11) String cpf,
            @JsonFormat(pattern = "dd-MM-yyy") String nascimento, @Length(min = 1, max = 1) String sexo) {
        this.pacienteId = pacienteId;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(long pacienteId) {
        this.pacienteId = pacienteId;
    } 
}
