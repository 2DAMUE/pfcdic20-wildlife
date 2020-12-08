package com.example.animalquiz.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.R;
import com.example.animalquiz.adapters.AnfibiosAdapter;
import com.example.animalquiz.javabean.Anfibios;
import com.example.animalquiz.javabean.DatosAnfibios;
import com.google.android.material.navigation.NavigationView;

public class AnfibiosActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    static final String CLAVE_ANFIBIOS = "ANFIBIOS";
    RecyclerView rv;
    LinearLayoutManager llm;
    AnfibiosAdapter anA;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anfibios);

        final DatosAnfibios datosAnfibios = new DatosAnfibios();

        rv = findViewById(R.id.rvAnfibios);

        rv.setHasFixedSize(true);

        anA = new AnfibiosAdapter(datosAnfibios.getListaAnfibios());

        llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        anA.asignacionOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = rv.getChildAdapterPosition(v);

                //Obtenemos los datos del ave seleccionado.
                Anfibios an = datosAnfibios.getListaAnfibios().get(i);

                Intent intent = new Intent(getApplicationContext(), DatosAnfibiosCompletosActivity.class);
                intent.putExtra(CLAVE_ANFIBIOS, an);
                startActivity(intent);
            }
        });

        rv.setAdapter(anA);

        toolbar = findViewById(R.id.toolbarAnfibios);
        drawerLayout = findViewById(R.id.draweAnfibios);
        navigationView = findViewById(R.id.navigationView);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.bringToFront();

        navigationView.setNavigationItemSelectedListener(this);
    }

    public void entrarPrincipal(View v){
        Intent i = new Intent(this, PrincipalActivity.class);
        startActivity(i);
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
