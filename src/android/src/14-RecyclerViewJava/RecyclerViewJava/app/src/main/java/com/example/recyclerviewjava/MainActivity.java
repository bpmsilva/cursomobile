package com.example.recyclerviewjava;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

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

        // Encontra o RecyclerView no layout
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Define o tipo de layout para a lista:
        // LinearLayoutManager organiza os itens em uma lista vertical (tipo lista de contatos)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Cria uma lista fixa de nomes completos (objeto FullName com nome e sobrenome)
        // Isso serve como dados de exemplo para alimentar o RecyclerView
        List<FullName> nameList = Arrays.asList(
                new FullName("Alice", "Smith"),
                new FullName("Bruno", "Johnson"),
                new FullName("Carlos", "Martinez"),
                new FullName("Daniela", "Garcia"),
                new FullName("Eduardo", "Lopez"),
                new FullName("Fernanda", "Hernandez"),
                new FullName("Gabriel", "Perez"),
                new FullName("Helena", "Gonzalez"),
                new FullName("Isabella", "Rodriguez"),
                new FullName("Javier", "Sanchez"),
                new FullName("Karina", "Torres"),
                new FullName("Luis", "Ramirez"),
                new FullName("Mariana", "Flores"),
                new FullName("Nicolas", "Rivera"),
                new FullName("Olivia", "Martinez"),
                new FullName("Pablo", "Diaz"),
                new FullName("Quinn", "Reyes"),
                new FullName("Rosa", "Morales"),
                new FullName("Sofia", "Cruz"),
                new FullName("Tomas", "Ortiz"),
                new FullName("Valentina", "Gutierrez"),
                new FullName("Xavier", "Castillo"),
                new FullName("Yara", "Vasquez"),
                new FullName("Zoe", "Mendoza"));

        // Cria o adapter que liga os dados (nameList) ao RecyclerView
        // O adapter é responsável por criar cada item da lista e preencher os dados visuais
        FullNameAdapter adapter = new FullNameAdapter(nameList);

        // Conecta o adapter ao RecyclerView: a lista agora sabe o que mostrar e como mostrar
        recyclerView.setAdapter(adapter);
    }
}