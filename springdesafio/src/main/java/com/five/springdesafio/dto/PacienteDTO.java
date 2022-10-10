package com.five.springdesafio.dto;

import com.five.springdesafio.model.clinica.Paciente;

public class PacienteDTO {

    private long pacienteId;
    private String nome;
    private String cpf;
    private String nascimento;
    private String sexo;

    public PacienteDTO() {
    }

    public PacienteDTO(long pacienteId, String nome, String cpf, String nascimento, String sexo) {
        this.pacienteId = pacienteId;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public PacienteDTO(Paciente modelPaciente) {
        this.pacienteId = modelPaciente.getPacienteId();
        this.nome = modelPaciente.getNome();
        this.cpf = modelPaciente.getCpf();
        this.nascimento = modelPaciente.getNascimento();
        this.sexo = modelPaciente.getSexo();
    }

    public long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(long pacienteId) {
        this.pacienteId = pacienteId;
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
