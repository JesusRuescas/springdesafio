package com.five.springdesafio.model.clinica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "Paciente")
public class Paciente extends Usuario {

    @OneToMany
    protected static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Paciente_id")
    public long pacienteId;

    public Paciente() {
    }

    public Paciente(long pacienteId, @Size(min = 1, max = 30) String nome, @Size(min = 11, max = 11) String cpf,
            @JsonFormat(pattern = "dd-MM-yyy") String nascimento, @Size(min = 1, max = 1) String sexo) {
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
