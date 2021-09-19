package com.pucpr.provapoo;

import java.util.ArrayList;

public class ContaCorrente {
    private int agencia;
    private int numero;
    private ArrayList<Transacao> transacoes = new ArrayList<>();
    private Cliente cliente;

    public ContaCorrente(int agencia, int numero, Transacao transacoes, Cliente cliente) {
        setAgencia(agencia);
        setNumero(numero);
        addTransacoes(transacoes);
        setCliente(cliente);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        /*
          Assert para que se caso o número não corresponda com o padrão de número de agência:

          4 digitos, ou em alguns casos : 4 digitos + 1 digito da agencia (Numero da conta sem símbolos)
        */
        assert (agencia <= 0 || agencia > 99999);
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        /*
            Assert para que se caso o número não corresponda com o padrão de número de conta corrente:

                5 digitos + 1 div. (Numero da conta sem símbolos)
         */
        assert (numero <=0 || numero > 999999);
        this.numero = numero;
    }

    public ArrayList<Transacao> getTransacoes() {
        return transacoes;
    }

    public void addTransacoes(Transacao transacao) {
        transacoes.add(transacao);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        assert (cliente.getClass().getSimpleName() != "Cliente");
        this.cliente = cliente;
    }

    public void depositar(String descricao, float valorDeposito){
        Transacao transacao = new Transacao(descricao, valorDeposito);
        addTransacoes(transacao);
        System.out.println("Deposito realizado com sucesso!");
    }

    public float retirar(String descricao, float valorRetirar){
        return 0f;
    }

    public float retornar(){
        float saldo = 0;
        for (Transacao transacao: transacoes){
            saldo += transacao.getValor();
        }
        return saldo;
    }

    public void extrato(){
        System.out.println("======Extrato Bancário======");
        System.out.println("Agencia: "+getAgencia());
        System.out.println("Número: "+getNumero());
        System.out.println("-------Lista de Transações-------");
        for (Transacao transacao: transacoes){
            transacao.imprimir();
        }
        System.out.println("Saldo: R$"+retornar());
        System.out.println("---------------------------------");
    }
}
