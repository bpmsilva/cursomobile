package com.example.simplesharedprefs;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Acessa a "MainPrefs" SharedPreferences
        SharedPreferences sharedPrefs = getSharedPreferences("MainPrefs", MODE_PRIVATE);

        // Acessa a variável count e incrementa seu valor. Se não existir, o valor padrão será 0
        int count = sharedPrefs.getInt("count", 0);

        // Exibe
        TextView textView = findViewById(R.id.textView);
        textView.setText("Chamada(s): " + count);


        // Incrementa o contador (número de vezes de chamadas de onCreate)
        count++;

        // Salva o novo valor de count na SharedPreferences
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putInt("count", count);
        editor.apply();
    }
}
