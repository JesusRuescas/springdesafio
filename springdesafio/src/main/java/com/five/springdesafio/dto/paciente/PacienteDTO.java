package com.five.springdesafio.dto.paciente;

import java.sql.Date;
import java.util.UUID;

public class PacienteDTO {
    private UUID id;
    private String nome;
    private String cpf;
    private Date nascimento;
    private String sexo;

    public PacienteDTO() {
    }

    public PacienteDTO(UUID id, String nome, String cpf, Date nascimento, String sexo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   

}
