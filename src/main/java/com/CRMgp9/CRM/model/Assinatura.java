package com.CRMgp9.CRM.model;

import java.time.LocalDate;


public class Assinatura {
    private Cliente cliente;
    private Plano plano;
    private LocalDate dataInicio;
    private LocalDate  dataFim;
    private boolean ativo;


    public Assinatura(Cliente cliente, Plano plano, LocalDate  dataInicio, LocalDate  dataFim, boolean ativo) {
        this.cliente = cliente;
        this.plano = plano;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.ativo = ativo;
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public LocalDate  getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate  dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate  getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate  dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
}
}

