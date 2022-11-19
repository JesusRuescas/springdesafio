package com.five.springdesafio.dto.paciente;

public class RegistroPacienteDTO {
    private String nome;
    private String cpf;
    private String nascimento;
    private String sexo;

    public RegistroPacienteDTO() {
    }

    public RegistroPacienteDTO(String nome, String cpf, String nascimento, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
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
