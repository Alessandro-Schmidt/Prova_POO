package com.pucpr.provapoo;

import java.time.LocalDate;
import java.util.Locale;

public class Transacao {
    private String descricao;
    private LocalDate data;
    private float valor;

    // Constructor
    public Transacao(String descricao, float valor) {
        setDescricao(descricao);
        if (valor<0){
            setValor(-valor);
        }else{
            setValor(valor);
        }
        setData(LocalDate.now());
    }
    // Getter and Setters
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

    // Método de impressão de status.
    public void imprimir(){
        System.out.println("Transação:");
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Data: "+getData());
        System.out.println("Valor: "+getValor());
    }
}