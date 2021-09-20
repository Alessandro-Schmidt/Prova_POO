package com.pucpr.provapoo;

import java.util.ArrayList;
import java.util.Locale;

public class ContaCorrente {
    private int agencia;
    private int numero;
    private ArrayList<Transacao> transacoes;
    private Cliente cliente;
    private float saldo;

    // Constructor
    public ContaCorrente(int agencia, int numero) {
        setAgencia(agencia);
        setNumero(numero);
        this.transacoes = new ArrayList<Transacao>();
    }

    // Getter and setter
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Método depositar

    public void depositar(String descricao, float valorDeposito){
        Transacao deposito = new Transacao(descricao, valorDeposito);
        addTransacoes(deposito);
        System.out.println("Deposito realizado com sucesso! (Valor: R$"+valorDeposito+")");
        saldo+= valorDeposito;
    }


    // Metodo retirar
    public void retirar(String descricao, float valorRetirar){
        Transacao retirada = new Transacao(descricao,valorRetirar);
        if (getSaldo()==0){
            System.out.println("");
            System.out.println("Operação inválida.");
        }else{
            if (getSaldo() >= valorRetirar){
                System.out.println("Retirada realizada com sucesso! (Valor: R$ -"+valorRetirar+")");
                saldo -= valorRetirar;
                addTransacoes(retirada);
            }else if (getSaldo() < valorRetirar){
                valorRetirar = getSaldo();
                System.out.println("Retirada realizada parcialmente (Valor: R$ -"+ valorRetirar +")");
                saldo -= valorRetirar;
                addTransacoes(retirada);
                assert (getSaldo() == 0);
            }
        }

    }
    // Método retornar
    public float retornar(){
        return getSaldo();
    }

    // Método de inmpressão de extrato

    public void extrato(){
        System.out.println("======Extrato Bancário======");
        System.out.println("Agencia: "+ getAgencia());
        System.out.println("Número: "+ getNumero());
        System.out.println("-------Lista de Transações-------");
        for (Transacao transacao: transacoes){
            transacao.imprimir();
        }
        String valorSaldo = String.format(Locale.FRENCH, "%.2f", getSaldo());

    }
}
