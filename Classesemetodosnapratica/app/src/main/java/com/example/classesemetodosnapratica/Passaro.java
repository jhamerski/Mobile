package com.example.classesemetodosnapratica;

public class Passaro extends Animal {

    public void voar(){
        System.out.println("Voando");
    }

    public void correr(){
        super.correr();
        System.out.println("cao");
    }
}
