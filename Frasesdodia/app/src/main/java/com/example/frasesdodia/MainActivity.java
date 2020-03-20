package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "O verdadeiro heroísmo consiste em persistir por mais um momento, quando tudo parece perdido!",
                "Nada acontece a menos que sonhemos antes!",
                "Seja corajoso. Mesmo que você não seja, finja ser. Ninguém nota a diferença!",
                "Sorte é o que acontece quando a preparação encontra a oportunidade!"
        };
        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textResultado);

        texto.setText(frases[numero]);

    }
}
