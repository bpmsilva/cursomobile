package com.example.linearandconstraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        // Guarda o padding definido no XML.
        View main = findViewById(R.id.main);
        int left = main.getPaddingLeft();
        int top = main.getPaddingTop();
        int right = main.getPaddingRight();
        int bottom = main.getPaddingBottom();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            // Soma o padding do XML ao espaço das barras do sistema.
            v.setPadding(
                    left + systemBars.left,
                    top + systemBars.top,
                    right + systemBars.right,
                    bottom + systemBars.bottom
            );
            return insets;
        });

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, ConstraintLayoutSample.class);
            startActivity(intent);
        });
    }
}