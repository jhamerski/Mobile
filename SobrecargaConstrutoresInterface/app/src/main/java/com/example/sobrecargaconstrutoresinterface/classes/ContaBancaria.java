package com.example.sobrecargaconstrutoresinterface.classes;

public class ContaBancaria   {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(){
        System.out.println("Construtor chamado...");
    }

    public ContaBancaria(int numeroConta){
        System.out.println("Número da conta " + numeroConta);
    }

}
