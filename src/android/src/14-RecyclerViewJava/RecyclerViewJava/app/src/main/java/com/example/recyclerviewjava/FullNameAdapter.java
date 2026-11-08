package com.example.recyclerviewjava;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Adapter é responsável por criar os ViewHolders e vinculá-los aos dados da lista.
 * Ele conecta a RecyclerView aos dados que serão exibidos.
 *
 * Cada item da RecyclerView é representado por um ViewHolder,
 * que define tanto a aparência quanto o conteúdo visual do item.
 *
 * Por isso herdamos de RecyclerView.Adapter<FullNameViewHolder>,
 * criando um modelo visual reaproveitável para cada item da lista.
 */
public class FullNameAdapter extends RecyclerView.Adapter<FullNameViewHolder> {
    private final List<FullName> fullNames;

    public FullNameAdapter(List<FullName> fullNames) {
        this.fullNames = fullNames;
    }

    @Override
    public FullNameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // O ViewGroup parent se refere a layout do RecyclerView,
        // e o LayoutInflater infla o layout do item (R.layout.item_full_name)
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_full_name, parent, false);
        return new FullNameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FullNameViewHolder holder, int position) {
        // Aqui você vincula o ViewHolder com os dados do FullName na posição atual
        FullName fullName = fullNames.get(position);
        holder.bind(fullName);
    }

    @Override
    public int getItemCount() {
        // Retorna o número total de itens na lista de nomes completos
        return fullNames.size();
    }
}
