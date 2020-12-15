package com.example.animalquiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.animalquiz.activities.AnfibiosActivity;
import com.example.animalquiz.activities.AvesActivity;
import com.example.animalquiz.activities.DesarrolladoresActivity;
import com.example.animalquiz.activities.MamiferosActivity;
import com.example.animalquiz.activities.MapsPrincipalActivity;
import com.example.animalquiz.activities.PecesActivity;
import com.example.animalquiz.activities.PrincipalActivity;
import com.example.animalquiz.activities.ReptilesActivity;
import com.example.animalquiz.activityQuiz1.Quiz1Activity;
import com.example.animalquiz.activityQuiz2.Quiz2Activity;
import com.example.animalquiz.activityQuiz3.Quiz3Activity;
import com.example.animalquiz.javabean.Aves;
import com.google.android.material.navigation.NavigationView;

public class PrincipalQuizActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_quiz);

        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.bringToFront();

        navigationView.setNavigationItemSelectedListener(this);
    }

    public void entrarQuiz1(View v){
        Intent i = new Intent(this, Quiz1Activity.class);
        startActivity(i);
    }

    //Botones que acceden al Quiz 2 y al Quiz 3, los cuales están en mantenimiento
    /*public void entrarQuiz2(View view) {
        Intent i = new Intent(this, Quiz2Activity.class);
        startActivity(i);
    }

    public void entrarQuiz3 (View v){
        Intent i = new Intent(this, Quiz3Activity.class);
        startActivity(i);
    }*/

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.itemQuiz:
                Intent i = new Intent(this, PrincipalQuizActivity.class);
                startActivity(i);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemHome:
                Intent home = new Intent(this, PrincipalActivity.class);
                startActivity(home);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemDesarrolladores:
                Intent desarrolladores = new Intent(this, DesarrolladoresActivity.class);
                startActivity(desarrolladores);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemMamiferos:
                Intent mamiferos = new Intent(this, MamiferosActivity.class);
                startActivity(mamiferos);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemAves:
                Intent aves = new Intent(this, AvesActivity.class);
                startActivity(aves);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemAnfibios:
                Intent anfibios = new Intent(this, AnfibiosActivity.class);
                startActivity(anfibios);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemReptiles:
                Intent reptiles = new Intent(this, ReptilesActivity.class);
                startActivity(reptiles);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemPeces:
                Intent peces = new Intent(this, PecesActivity.class);
                startActivity(peces);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemMapa:
                Intent mapa = new Intent(this, MapsPrincipalActivity.class);
                startActivity(mapa);
                drawerLayout.closeDrawers();
                break;
        }

        return true;
    }

    @Override public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
