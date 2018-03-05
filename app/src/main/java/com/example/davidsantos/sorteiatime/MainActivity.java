package com.example.davidsantos.sorteiatime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private EditText editNumeroJogadores;
    private EditText editJogadoresPorTime;
    private int numeroJogadores;
    private int JogadoresPorTime;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumeroJogadores = findViewById(R.id.editNumeroJogadores);
        editJogadoresPorTime = findViewById(R.id.editJogadoresPorTime);
    }

    public boolean validaTela(){


        if(editNumeroJogadores.getText().toString().trim().equals("")){
            editNumeroJogadores.setError("Preencha este campo!");
            editNumeroJogadores.requestFocus();
            return false;
        }
        if(editJogadoresPorTime.getText().toString().trim().equals("")){
            editJogadoresPorTime.setError("Preencha este campo!");
            editJogadoresPorTime.requestFocus();
            return false;
        }

        try {
            numeroJogadores = Integer.parseInt(editNumeroJogadores.getText().toString());
        } catch(NumberFormatException nfe) {
            editNumeroJogadores.setError("Use um numero inteiro!");
            editNumeroJogadores.requestFocus();
            return false;
        }

        try {
            JogadoresPorTime = Integer.parseInt(editJogadoresPorTime.getText().toString());
        } catch(NumberFormatException nfe) {
            editJogadoresPorTime.setError("Use um numero inteiro!");
            editJogadoresPorTime.requestFocus();
            return false;
        }
        return true;
    }

    public void iniciar(View view){

        if(!validaTela()){
            return;
        }

        Intent i = new Intent(MainActivity.this, SorteiaActivity.class);
        i.putExtra("numeroJogadores", numeroJogadores);
        i.putExtra("JogadoresPorTime", JogadoresPorTime);
        startActivity(i);
    }
}
