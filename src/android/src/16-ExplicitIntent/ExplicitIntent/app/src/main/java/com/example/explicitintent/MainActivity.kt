package com.example.explicitintent

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtém a referência do botão definido no layout
        val button = findViewById<android.widget.Button>(R.id.activityButton)

        // Adiciona um click listener ao botão
        // para iniciar a SecondaryActivity com um Intent explícito
        button.setOnClickListener {
            val intent = Intent(this, SecondaryActivity::class.java).apply {
                putExtra("ToastMessage", "Hello from MainActivity")
            }
            startActivity(intent)
        }
    }
}