package com.pucpr.provapoo;

import java.util.ArrayList;
import java.util.Locale;

public class Cliente {
    private String nome;
    private ArrayList<ContaCorrente> contasCorrentes = new ArrayList<>();

    // Constructor
    public Cliente(String nome, ContaCorrente contaCorrente) {
        setNome(nome);
        addContaCorrente(contaCorrente);
    }


    // Getter and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        assert (nome.getClass().getSimpleName() != "String");
        this.nome = nome;
    }

    public ArrayList<ContaCorrente> getContasCorrentes() {
        return contasCorrentes;
    }

    public void addContaCorrente(ContaCorrente contaCorrente) {
        contasCorrentes.add(contaCorrente);
    }

    public float saldoTotal(ContaCorrente contaCorrente){
        return contaCorrente.getSaldo();
    }

    public void imprimir(){
        System.out.println("Nome: "+getNome());
        System.out.println("-------Lista de Contas Correntes-------");
        for (ContaCorrente contasCorrentes: contasCorrentes){
            contasCorrentes.extrato();
            String valorSaldo = String.format(Locale.FRENCH, "%.2f", contasCorrentes.getSaldo());
            System.out.println("Saldo: R$ "+ valorSaldo);
        }
        System.out.println("---------------------------------");
    }

    public void operar(ContaCorrente contaCorrente){
        contaCorrente.depositar("Ração do cachorro", 50f);
        contaCorrente.depositar("Aluguel", 600f);
        contaCorrente.depositar("Conta de Água", 130f);
        contaCorrente.retirar("Universidade", 100);
        contaCorrente.retirar("Compras no Mercado", 200f);
        contaCorrente.retirar("Shopping", 150f);
        System.out.println("------------------------");
        contaCorrente.extrato();
        System.out.println("Saldo: R$ "+ contaCorrente.retornar());
        System.out.println("------------------------");
    }
}