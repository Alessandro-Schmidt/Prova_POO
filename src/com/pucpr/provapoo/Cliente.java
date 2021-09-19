package com.pucpr.provapoo;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<ContaCorrente> contasCorrente = new ArrayList<>();

    public Cliente(String nome, ArrayList<ContaCorrente> contasCorrente) {
        setNome(nome);
        setContasCorrente(contasCorrente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        assert (nome.getClass().getSimpleName() != "String");
        this.nome = nome;
    }

    public ArrayList<ContaCorrente> getContasCorrente() {
        return contasCorrente;
    }

    public void setContasCorrente(ArrayList<ContaCorrente> contasCorrente) {
        this.contasCorrente = contasCorrente;
    }

    public float saldoTotal(){
        return 0f; //Teste
    }

    public void imprimir(){

    }


}