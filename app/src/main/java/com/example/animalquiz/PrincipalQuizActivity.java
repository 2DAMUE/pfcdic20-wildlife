package com.example.animalquiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
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
import com.example.animalquiz.activities.MamiferosActivity;
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

    public void entrarPrincipal(View v){
        Intent i = new Intent(PrincipalQuizActivity.this, PrincipalActivity.class);
        startActivity(i);
    }

    public void entrarQuiz1(View v){
        Intent i = new Intent(this, Quiz1Activity.class);
        startActivity(i);
    }

    public void entrarQuiz2(View view) {
        Intent i = new Intent(this, Quiz2Activity.class);
        startActivity(i);
    }

    public void entrarQuiz3 (View v){
        Intent i = new Intent(this, Quiz3Activity.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.itemHome:
                Intent i = new Intent(this, PrincipalActivity.class);
                startActivity(i);
                break;
            case R.id.itemDesarrolladores:
                Toast.makeText(this, "Desarrolladores", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemEditarPerfil:
                Toast.makeText(this, "Editar perfil", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemMamiferos:
                Intent mamiferos = new Intent(this, MamiferosActivity.class);
                startActivity(mamiferos);
                break;
            case R.id.itemAves:
                Intent aves = new Intent(this, AvesActivity.class);
                startActivity(aves);
                break;
            case R.id.itemAnfibios:
                Intent anfibios = new Intent(this, AnfibiosActivity.class);
                startActivity(anfibios);
                break;
            case R.id.itemReptiles:
                Intent reptiles = new Intent(this, ReptilesActivity.class);
                startActivity(reptiles);
                break;
            case R.id.itemPeces:
                Intent peces = new Intent(this, PecesActivity.class);
                startActivity(peces);
                break;
            case R.id.itemSalir:
                AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
                dialogo1.setTitle("Confirmacion salida");
                dialogo1.setMessage("¿Desea salir de la aplicación?");
                dialogo1.setCancelable(false);
                dialogo1.setPositiveButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        dialogo1.dismiss();
                    }
                });
                dialogo1.setNegativeButton("Confirmar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        finish();
                        onDestroy();
                    }
                });
                dialogo1.show();
                break;
        }

        return true;
    }
}
