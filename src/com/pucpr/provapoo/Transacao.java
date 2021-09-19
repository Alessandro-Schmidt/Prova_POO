package com.pucpr.provapoo;

import java.time.LocalDate;
import java.util.Locale;

public class Transacao {
    private String descricao;
    private LocalDate data;
    private float valor;

    public Transacao(String descricao, float valor) {
        setDescricao(descricao);
        setValor(valor);
        setData(LocalDate.now());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void imprimir(){
        System.out.println("Transação:");
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Data: "+getData());
        System.out.println("Valor: "+getValor());
    }
}