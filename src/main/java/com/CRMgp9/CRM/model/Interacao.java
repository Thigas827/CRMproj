package com.CRMgp9.CRM.model;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Interacao {
    private LocalDate data;
    private String tipo; // Avaliação física, renovação, suporte
    private String observacao;
    private Usuario responsavel;
//construtor
    public Interacao(LocalDate data, String tipo, String observacao, Usuario responsavel) {
        this.data = data;
        this.tipo = tipo;
        this.observacao = observacao;
        this.responsavel = responsavel;
    }
    // Construtor vazio
    public Interacao() {
    }
}
