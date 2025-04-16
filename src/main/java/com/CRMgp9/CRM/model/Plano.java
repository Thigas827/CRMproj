package com.CRMgp9.CRM.model;

public class Plano extends Produto {
    private int duracaoMeses;
    private double valorMensal;

public Plano(String id, String nome, int duracaoMeses, double valorMensal) {
        super(id, nome);
        this.duracaoMeses = duracaoMeses;
        this.valorMensal = valorMensal;
    }


 //getters e setters
    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }
}