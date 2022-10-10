package com.five.springdesafio.model.clinica;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Medico")
public class Medico extends Usuario {
    protected static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MedicoId")
    public long MedicoId;

    @Size(min = 5, max = 5)
    public int crm;
    
    public Medico(){}

    public Medico(long medicoId, @Size(min = 5, max = 5) int crm, @Size(min = 1, max = 45) String nome,
    @Size(min = 11, max = 11) String cpf, @JsonFormat(pattern = "dd-MM-yyyy") String nascimento,
    @Size(min = 1, max = 1) String sexo) {
        this.MedicoId = medicoId;
        this.crm = crm;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getMedicoId() {
        return MedicoId;
    }

    public void setMedicoId(int medicoId) {
        MedicoId = medicoId;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    

}



