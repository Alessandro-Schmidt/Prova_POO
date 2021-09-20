package com.pucpr.provapoo;
/*
Autores: Alessandro Maciel Schmidt e Vinícius Kuchnir Rodrigues Pinto
Data: 19/09/2021
* */

import java.util.ArrayList;

public class Banco {

    public static void main(String[] args) {

        ContaCorrente conta01 = new ContaCorrente(123, 345);
        ContaCorrente conta02 = new ContaCorrente(188,399);
        ContaCorrente conta03 = new ContaCorrente(144,366);

        Cliente cliente01 = new Cliente("Josefino", conta01);
        Cliente cliente02 = new Cliente("Vinicius", conta02);
        Cliente cliente03 = new Cliente("Alessandro", conta03);

        cliente01.addContaCorrente(new ContaCorrente(155, 141));
        cliente02.addContaCorrente(new ContaCorrente(157, 191));
        cliente03.addContaCorrente(new ContaCorrente(158, 188));

        cliente01.operar(conta01);


    }
}