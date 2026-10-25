package com.example.listviewandroid;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> items = new ArrayList<>();

    void addDummyData() {
        items.add("Abacaxi");
        items.add("Banana");
        items.add("Caju");
        items.add("Damasco");
        items.add("Espinafre");
    }

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

        // Referências aos elementos da interface
        ListView listView     = findViewById(R.id.listView);
        EditText itemEditText = findViewById(R.id.itemEditText);
        Button   addButton    = findViewById(R.id.addButton);

        // Dados iniciais da lista
        addDummyData();

        // ArrayAdapter e vinculação dos dados à ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        // Configuração do botão para adicionar itens à lista
        addButton.setOnClickListener(v -> {
            String novoItem = itemEditText.getText().toString();
            if (!novoItem.isEmpty()) {
                // Adiciona o novo item à lista e atualiza o ListView
                items.add(novoItem);

                // Notifica o ArrayAdapter que os dados foram alterados
                adapter.notifyDataSetChanged();

                // Limpa o EditText
                itemEditText.setText("");
            }
        });
    }
}