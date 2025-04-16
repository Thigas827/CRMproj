package com.CRMgp9.CRM.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Produto {
    protected String id;
    protected String nome;

    public Produto(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
