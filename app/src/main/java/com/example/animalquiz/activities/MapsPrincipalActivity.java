package com.example.animalquiz.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.mapasActivity.ActivityMapaAnfibios;
import com.example.animalquiz.mapasActivity.ActivityMapaPeces;
import com.example.animalquiz.mapasActivity.ActivityMapaReptiles;
import com.example.animalquiz.R;
import com.example.animalquiz.mapasActivity.ActivityMapaAves;
import com.example.animalquiz.mapasActivity.ActivityMapaMamiferos;
import com.google.android.material.navigation.NavigationView;

public class MapsPrincipalActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Button btnMapa;
    Button btnMapaAves;
    Button btnAnfi;
    Button btnRep;
    Button btnPec;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_principal);

        btnMapa = (Button) findViewById(R.id.btnMapa);
        btnMapaAves = (Button) findViewById(R.id.buttonMapaAves);
        btnAnfi = (Button) findViewById(R.id.btnMapaAnfibios);
        btnRep = (Button) findViewById(R.id.btnReptiles);
        btnPec = (Button) findViewById(R.id.btnPeces);

        toolbar = findViewById(R.id.toolbarMapaAnimales);
        drawerLayout = findViewById(R.id.drawerMapaAnimales);
        navigationView = findViewById(R.id.navigationView);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.bringToFront();

        navigationView.setNavigationItemSelectedListener(this);

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMapaMamiferos.class);

                startActivity(intent);
            }
        });

        btnMapaAves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMapaAves.class);

                startActivity(intent);



            }
        });

        btnAnfi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMapaAnfibios.class);

                startActivity(intent);



            }
        });

        btnRep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMapaReptiles.class);

                startActivity(intent);



            }
        });

        btnPec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMapaPeces.class);

                startActivity(intent);



            }
        });
    }

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
        }

        return false;
    }

    @Override public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
