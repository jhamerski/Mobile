package com.example.classesemetodosnapratica;

public class Funcionario {
    //propriedades
    String nome;
    Double salario;

    //metodos
    Double recuperarSalario(double bonus, double desconto){
        this.salario += - (this.salario * 0.1);
        //System.out.println(this.salario);
        return this.salario + bonus - desconto;
    }

}
