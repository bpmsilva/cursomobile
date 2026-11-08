package com.example.recyclerviewjava;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * ViewHolder é um representante visual do item da lista.
 * Ele que armazena as referências das Viewsusadas para exibir um nome completo (nome e sobrenome)
 * Cada item da RecyclerView é exibido por um ViewHolder, que define a aparência e os dados mostrados
 * Por isso herdamos de RecyclerView.ViewHolder, para criar esse "modelo visual" reaproveitável
 */
public class FullNameViewHolder extends RecyclerView.ViewHolder {
    private final TextView firstNameTextView;
    private final TextView lastNameTextView;

    public FullNameViewHolder(View itemView) {
        // Aqui a View será o layout do item da RecyclerView (ex: R.layout.item_full_name)
        super(itemView);
        firstNameTextView = itemView.findViewById(R.id.firstNameTextView);
        lastNameTextView = itemView.findViewById(R.id.lastNameTextView);
    }

    public void bind(FullName fullName) {
        // Aqui você vincula os dados do FullName às Views
        firstNameTextView.setText(fullName.getFirstName());
        lastNameTextView.setText(fullName.getLastName());
    }
}