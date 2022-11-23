package com.five.springdesafio.dto.atendimento;

import java.sql.Date;
import java.util.UUID;

public class AtendimentoDTO {
    private UUID id;
    private Date data;
    private String observacao;
    private boolean ativo;
    private String crm;
    private String cpf;

    public AtendimentoDTO() {
    }

    public AtendimentoDTO(UUID id, Date data, String observacao, boolean ativo, String crm, String cpf) {
        this.id = id;
        this.data = data;
        this.observacao = observacao;
        this.ativo = ativo;
        this.crm = crm;
        this.cpf = cpf;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
