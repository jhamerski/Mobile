package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool, editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextInputEditText
        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);

        textResultado = findViewById(R.id.textResultado);
    }

    public void calcular(View view){

        //capturar valores digitados
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        //validar campos digitados
        boolean camposValidados = camposPreenchidos(precoAlcool, precoGasolina);


        if(camposValidados){
            //converter String para numero
            double precoAlcoolConvertido = Double.parseDouble(precoAlcool);
            double precoGasolinaConvertido = Double.parseDouble(precoGasolina);

            double resultado = precoAlcoolConvertido / precoGasolinaConvertido;

            if( resultado >= 0.7){
                textResultado.setText("É melhor utilizar gasolina.");
            }else{
                textResultado.setText("É melhor utilizar álcool.");
            }

        }else{
            textResultado.setText("Preencha os preços primeiros.");
        }

    }

    public boolean camposPreenchidos(String pAlcool, String pGasolina){

        boolean camposValidados = true;

        if(pAlcool == null || pAlcool.equals("")){
            camposValidados = false;
        }else if(pGasolina == null || pGasolina.equals("")){
            camposValidados = false;
        }

        return camposValidados;
    }


}
