package com.example.assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.navigation.NavigationView;

public class drawerBaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    @Override
    public void setContentView(View view){
        drawerLayout= (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_drawer_base,null);
        FrameLayout container= drawerLayout.findViewById(R.id.activityContainer);
        container.addView(view);
        super.setContentView(drawerLayout);

        Toolbar toolbar= drawerLayout.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = drawerLayout.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.menu_drawer_open , R.string.menu_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        switch(item.getItemId()){
            case R.id.menu_home:
                startActivity(new Intent(this, MainActivity.class));
                overridePendingTransition(0,0);
                break;
            case R.id.menu_dogs:
                startActivity(new Intent(this, DogsActivity.class));
                overridePendingTransition(0,0);
                break;
            case R.id.menu_donate:
                startActivity(new Intent(this, activity_donate.class));
                overridePendingTransition(0,0);
                break;
            case R.id.menu_visit:
            startActivity(new Intent(this, activity_visit.class));
                overridePendingTransition(0,0);
                break;
            case R.id.menu_volunteer:
            startActivity(new Intent(this, activity_volunteer.class));
                overridePendingTransition(0,0);
                break;
            case R.id.menu_news:
                startActivity(new Intent(this, NewsActivity.class));
                overridePendingTransition(0,0);
                break;
            case R.id.menu_team:
                startActivity(new Intent(this, activity_team.class));
                overridePendingTransition(0,0);
                break;
        }
        return false;

    }

    protected void allocateActivityTitle(String titleString){

        if(getSupportActionBar() !=null){
            getSupportActionBar().setTitle(titleString);
        }

    }
}