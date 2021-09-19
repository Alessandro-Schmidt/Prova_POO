package com.pucpr.provapoo;
/*
Autores: Alessandro Maciel Schmidt e Vinícius Kuchnir Rodrigues Pinto
Data: 19/09/2021
* */

public class Banco {

    public static void main(String[] args) {
        Transacao pix01 = new Transacao("Pagamento das aulas de piano", 1567.98f);
        pix01.imprimir();
    }
}