package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private  TextView textoResultado;

    /*
    private CheckBox checkVerde;
    private CheckBox checkBranco;
    private CheckBox checkVermelha;
     */

    //RadionButton
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);

        /*
        //checkBox
        CheckBox checkVerde = findViewById(R.id.checkVerde);
        CheckBox checkBranco = findViewById(R.id.checkBranco);
        CheckBox checkVermelha = findViewById(R.id.checkVermelha);
        /
         */

        //RadionButton
        sexoMasculino = findViewById(R.id.radioMasculino);
        sexoFeminino = findViewById(R.id.radioFeminino);
        opcaoSexo = findViewById(R.id.radioGroupSexo);

        //chamando o ouvinte
        radioButton();
    }

        /*
        public void checkBox(){

            String texto = "";

            if(checkVerde.isChecked()){
                texto = "Verde selecionado -";
            }
            if(checkBranco.isChecked()){
                texto = texto + "Branco selecionado -";
            }
            if(checkVermelha.isChecked()){
                texto = texto + "Vermelha selecionado -";
            }

            textoResultado.setText( texto );

        }*/

        public void radioButton(){

            opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    if(checkedId == R.id.radioMasculino){
                        textoResultado.setText("Masculino");
                    }else if(checkedId == R.id.radioFeminino){
                        textoResultado.setText("Feminino");
                    }
                }
            });

            /*
            String texto = "";
            if(sexoMasculino.isChecked()){
                textoResultado.setText("Masculino");
            }else{
                textoResultado.setText("Feminino");
            }
            */



        }



        public void enviar(View view){

            //checkBox();

            //radioButton();

            String nome = campoNome.getText().toString();
            String email = campoEmail.getText().toString();
            //textoResultado.setText(nome + " tem e-mail: " + email);

        }

        public void limpar(View view){
            campoNome.setText("");
            campoEmail.setText("");
            textoResultado.setText("");
        }

}
