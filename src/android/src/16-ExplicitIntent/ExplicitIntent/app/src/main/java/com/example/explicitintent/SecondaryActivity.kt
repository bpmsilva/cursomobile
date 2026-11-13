package com.example.explicitintent

import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_secondary)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtém a mensagem do Toast enviada pela MainActivity
        val toastMessage = intent.getStringExtra("ToastMessage")
        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show()
        findViewById<Button>(R.id.finishButton).setOnClickListener {
            finish()
        }
    }
}