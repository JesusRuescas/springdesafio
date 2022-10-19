package com.five.springdesafio.model.clinica;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@MappedSuperclass
@Table(name = "Usuario")
public class Usuario implements Serializable {
    @ManyToMany
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Usuario_id")
    protected static final long serialVersionUID = 1L;

    @Size(min = 1, max = 30)
    protected String nome;

    @Size(min = 11, max = 11)
    protected String cpf;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    protected String nascimento;

    @Size(min = 1, max = 1)
    protected String sexo;

    public Usuario() {
    }

    public Usuario(@Size(min = 1, max = 30) String nome, @Size(min = 11, max = 11) String cpf, String nascimento,
            @Size(min = 1, max = 1) String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}