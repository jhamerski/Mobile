package com.example.classesemetodosnapratica;

public class Animal {
    private int tamanho;
    private String cor;
    private double peso;

    public int getTamanho(){
        return this.tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void dormir(){
        System.out.println("Dormindo...");
    }

    public void correr(){
        System.out.println("Correr como um ");
    }
}
