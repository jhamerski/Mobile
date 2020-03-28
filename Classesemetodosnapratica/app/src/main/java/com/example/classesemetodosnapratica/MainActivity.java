package com.example.classesemetodosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Casa minhaCasa = new Casa();
        minhaCasa.cor = "Cinza";
        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();
         */
        /*
        Funcionario func = new Funcionario();
        func.nome = "Jonas";
        func.salario = 1000.0;
        //func.recuperarSalario();

        double salarioRecuperado = func.recuperarSalario(150, 50);
        System.out.println(salarioRecuperado);
        */

        /*
        Animal animal = new Animal();
        Cao cao = new Cao();
        Passaro passaro = new Passaro();
        */
        Conta conta = new Conta();

        conta.depositar(100);



    }
}
