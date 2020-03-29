package com.example.sobrecargaconstrutoresinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.example.sobrecargaconstrutoresinterface.classes.ContaBancaria;
import com.example.sobrecargaconstrutoresinterface.classes.Jonas;
import com.example.sobrecargaconstrutoresinterface.classes.Obama;
import com.example.sobrecargaconstrutoresinterface.classes.Pessoa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa p1 = new Pessoa();

        p1.exibirDados("Jonas");
        p1.exibirDados("Jonas", 33);

        ContaBancaria conta = new ContaBancaria(123456);

        Obama obama = new Obama();
        obama.direitosDeveres();

        Jonas jonas = new Jonas();
        jonas.direitosDeveres();

        obama.ganharEleicao();
        jonas.ganharEleicao();

    }
}
