package com.example.assignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{

    Context context;
    List<NewsItems> newsItems;

    public MyRecyclerViewAdapter(Context context, List<NewsItems> newsItems) {
        this.context = context;
        this.newsItems = newsItems;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(LayoutInflater.from(context).inflate(R.layout.newsitem_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.titleView.setText(newsItems.get(position).getTitle());
        holder.dateView.setText(newsItems.get(position).getDate());
        holder.imageView.setImageResource(newsItems.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return newsItems.size();
    }
}
