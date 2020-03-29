package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("Pedra");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("Tesoura");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("Papel");
    }

    public void opcaoSelecionada(String escolhaUsuario){

        ImageView imagemResultado = findViewById(R.id.imageResultado);
        TextView textoResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3);// 0 1 2
        String[] opcoes = {"Pedra", "Tesoura", "Papel"};
        String escolhaApp = opcoes [numero];

        switch( escolhaApp ){
            case "Pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "Tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
            case  "Papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
        }

        if(
                (escolhaApp == "Tesoura" && escolhaUsuario == "Papel") ||
                (escolhaApp == "Papel" && escolhaUsuario == "Pedra") ||
                (escolhaApp == "Pedra" && escolhaUsuario == "Tesoura")
        ){//App ganhador
                textoResultado.setText("Tente outra vez. \nVocê perdeu. :( ");
        }else if(
                (escolhaUsuario == "Tesoura" && escolhaApp == "Papel") ||
                (escolhaUsuario == "Papel" && escolhaApp == "Pedra") ||
                (escolhaUsuario == "Pedra" && escolhaApp == "Tesoura")
        ){//Usuario ganhador
            textoResultado.setText("PARABÉNS. \nVocê ganhou. :D ");
        }else{//Empate
            textoResultado.setText("Empatamos. :) ");
        }

    }
}
