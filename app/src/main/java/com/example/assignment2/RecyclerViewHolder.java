package com.example.assignment2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView; TextView titleView; TextView dateView;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.newsImageView);
        titleView = itemView.findViewById(R.id.newsTitle);
        dateView = itemView.findViewById(R.id.newsDate);

    }
}
