package com.pucpr.provapoo;
/*
Autores: Alessandro Maciel Schmidt e Vinícius Kuchnir Rodrigues Pinto
Data: 19/09/2021
* */

import java.util.ArrayList;

public class Banco {

    public static void main(String[] args) {
        Transacao pix01 = new Transacao("Pagamento das aulas de piano", 1567.98f);
        //pix01.imprimir();
        Transacao pix02 = new Transacao("Pagamento das aulas de piano", 1567.98f);
        //ContaCorrente CC = new ContaCorrente(1283, 1827344,);
        ContaCorrente CC = new ContaCorrente(1234, 12333);
        CC.depositar("Aulas particulares", 104.56f);
        CC.depositar("Salário", 1185.78f);
        CC.retirar("Contas", 2000f);
        CC.retirar("Mais contas", 300f);
    }
}