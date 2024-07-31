package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.assignment2.databinding.ActivityDogsBinding;
import com.example.assignment2.databinding.ActivityNewsBinding;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends drawerBaseActivity {

    ActivityNewsBinding activityNewsBinding;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityNewsBinding= ActivityNewsBinding.inflate(getLayoutInflater());
        setContentView(activityNewsBinding.getRoot());


        List<NewsItems> newsItems = new ArrayList<NewsItems>();

        newsItems.add(new NewsItems(context.getString(R.string.newsTitle1), "18 May 2023", R.drawable.news1));
        newsItems.add(new NewsItems(context.getString(R.string.newsTitle2), "10 February 2023",R.drawable.news2));
        newsItems.add(new NewsItems(context.getString(R.string.newsTitle3), "10 January 2023", R.drawable.news3));
        newsItems.add(new NewsItems(context.getString(R.string.newsTitle4), "23 September 2022", R.drawable.news4));
        newsItems.add(new NewsItems(context.getString(R.string.newsTitle5), "20 September 2022", R.drawable.news6));
        newsItems.add(new NewsItems(context.getString(R.string.newsTitle6), "20 August 2022", R.drawable.news5));
        newsItems.add(new NewsItems(context.getString(R.string.newsTitle7), "10 August 2022", R.drawable.news2));
        newsItems.add(new NewsItems(context.getString(R.string.newsTitle8), "3 August 2022",R.drawable.news1));
        newsItems.add(new NewsItems(context.getString(R.string.newsTitle9), "8 July 2022", R.drawable.news3));
        newsItems.add(new NewsItems(context.getString(R.string.newsTitle10), "4 July 2022", R.drawable.news5));
        RecyclerView newsRecyclerView= findViewById(R.id.newsRecyclerView);
        newsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        newsRecyclerView.setAdapter(new MyRecyclerViewAdapter(getApplicationContext(), newsItems));
    }
}