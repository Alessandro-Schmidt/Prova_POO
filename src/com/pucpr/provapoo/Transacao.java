package com.pucpr.provapoo;

import java.time.LocalDate;
import java.util.Currency;
import java.util.Locale;

public class Transacao {
    private String descricao;
    private LocalDate data;
    private float valor;

    // Constructor
    public Transacao(String descricao, float valor) {
        setDescricao(descricao);
        setValor(valor);
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
        System.out.println("-----------------------");
        System.out.println("Detalhes da Transação:");
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Data: "+getData().getDayOfMonth()+"/"+getData().getMonthValue()+"/"+getData().getYear());
        String valorTransacao = String.format(Locale.FRENCH, "%.2f", getValor());
        System.out.println("Valor: R$ "+ valorTransacao);
        System.out.println("-----------------------");
    }
}