package com.example.clicktypes;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

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

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Toast.makeText(this, "Botão com onClickListener!!", Toast.LENGTH_SHORT).show();
        });
    }

    public void saudacao(View v) {
        /**
         * Para que este método seja chamado, você pode incluir
         * 'android:onClick="saudacao"' no elemento botão de activity_main.xml
         */
        Toast.makeText(this, "Botão com onClick!!", Toast.LENGTH_LONG).show();
    }
}