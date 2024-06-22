package com.example.firstkotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name,email;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        image= itemView.findViewById(R.id.image);
        name= itemView.findViewById(R.id.names);
        email= itemView.findViewById(R.id.mail);
    }
}
