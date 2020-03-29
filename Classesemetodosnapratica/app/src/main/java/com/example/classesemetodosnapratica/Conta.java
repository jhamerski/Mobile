package com.example.classesemetodosnapratica;

/*
* Public: Todas classes tem acesso
* Private: Somente dentro da própria classe
* Protected: Pode ser acessado da subclasse ou mesmo pacote
* Default: Permitindo o acesso do mesmo pacote
* */

public class Conta {

    private int numConta;
    private double saldoConta = 100.0;

    public void depositar(double valor){
        this.saldoConta += valor;
    }

    public void sacar(double valor){
        this.saldoConta -= valor;
    }

    public double recuperarSalto(){
        return double this.saldoConta;
    }
}
