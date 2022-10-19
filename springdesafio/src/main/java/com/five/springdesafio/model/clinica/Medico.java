package com.five.springdesafio.model.clinica;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = " Medico")
public class Medico extends Usuario {

    @ManyToMany
    protected static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long medicoId;

    @Size(min = 5, max = 5)
    public int crm;

    public Medico() {
    }

    public Medico(long medicoId, @Size(min = 5, max = 5) int crm, @Size(min = 1, max = 45) String nome,
            @Size(min = 11, max = 11) String cpf, @JsonFormat(pattern = "dd-MM-yyyy") String nascimento,
            @Size(min = 1, max = 1) String sexo) {
        this.medicoId = medicoId;
        this.crm = crm;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(long medicoId) {
        this.medicoId = medicoId;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }


}