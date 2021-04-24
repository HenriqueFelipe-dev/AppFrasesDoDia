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

    public void gerarFrase (View view){

        String[] frases = {"Desista hoje para não perder amanhã",
                "Penso, logo desisto",
                "A luta é grande, mas a derrota é certa",
                "Sem lutas não há derrotas",
                "Com grandes poderes vem grandes derrotas",
                "Vai e, se der medo, volte",
                "Acreditar que pode já é meio caminho errado"};

        int num = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.textView);
        texto.setText(frases[num]);

    }
}