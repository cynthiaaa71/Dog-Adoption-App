package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.assignment2.databinding.ActivityDogsBinding;
import com.example.assignment2.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;


public class DogsActivity extends drawerBaseActivity {

    ActivityDogsBinding activityDogsBinding;
    Context context= this;
    TabLayout dogsTabLayout;
    ViewPager2 viewPager2;
    myViewPagerAdapter myViewPageAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityDogsBinding= ActivityDogsBinding.inflate(getLayoutInflater());
        setContentView(activityDogsBinding.getRoot());
        dogsTabLayout= findViewById(R.id.dogs_tabLayout);
        dogsTabLayout.addTab(dogsTabLayout.newTab().setText(context.getString(R.string.nav_puppies)));
        dogsTabLayout.addTab(dogsTabLayout.newTab().setText(context.getString(R.string.nav_trained)));
        dogsTabLayout.addTab(dogsTabLayout.newTab().setText(context.getString(R.string.nav_small)));
        dogsTabLayout.addTab(dogsTabLayout.newTab().setText(context.getString(R.string.nav_large)));

        viewPager2=findViewById(R.id.dogs_viewpager);
        myViewPageAdapter= new myViewPagerAdapter(this);
        viewPager2.setAdapter(myViewPageAdapter);

        dogsTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position){
                super.onPageSelected(position);
                dogsTabLayout.getTabAt(position).select();
            }
        });

    }
}