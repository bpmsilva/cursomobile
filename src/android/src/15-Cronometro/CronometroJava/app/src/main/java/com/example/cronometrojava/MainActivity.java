package com.example.cronometrojava;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Chronometer cronometro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cronometro = findViewById(R.id.cronometro);
        Button botaoIniciar = findViewById(R.id.botaoIniciar);

        botaoIniciar.setOnClickListener(view -> {
            // Define o instante inicial: a contagem começa em zero.
            cronometro.setBase(SystemClock.elapsedRealtime());

            // Inicia a contagem crescente.
            cronometro.start();

            // Impede novos cliques.
            botaoIniciar.setEnabled(false);
        });
    }
}