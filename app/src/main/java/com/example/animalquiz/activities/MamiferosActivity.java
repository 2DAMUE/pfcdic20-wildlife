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
import android.text.Html;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.R;
import com.example.animalquiz.adapters.MamiferoAdapter;
import com.example.animalquiz.javabean.DatosMamiferos;
import com.example.animalquiz.javabean.Mamiferos;
import com.google.android.material.navigation.NavigationView;

public class MamiferosActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    static final String CLAVE_MAMIFERO = "MAMIFEROS";
    RecyclerView rv;
    LinearLayoutManager llm;
    MamiferoAdapter ma;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamiferos);

        final DatosMamiferos datosMamiferos = new DatosMamiferos();

        rv = findViewById(R.id.rvMamiferos);

        rv.setHasFixedSize(true);

        ma = new MamiferoAdapter(datosMamiferos.getListaMamiferos());

        llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        ma.asignacionOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = rv.getChildAdapterPosition(v);

                Mamiferos m = datosMamiferos.getListaMamiferos().get(i);

                Intent intent = new Intent(getApplicationContext(), DatosMamiferosCompletosActivity.class);
                intent.putExtra(CLAVE_MAMIFERO, m);
                startActivity(intent);
            }
        });

        rv.setAdapter(ma);

        toolbar = findViewById(R.id.toolbarMamiferos);
        drawerLayout = findViewById(R.id.drawerMamiferos);
        navigationView = findViewById(R.id.navigationView);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.bringToFront();

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.itemHomeM:
                Intent i = new Intent(this, PrincipalActivity.class);
                startActivity(i);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemQuizM:
                Intent quiz = new Intent(this, PrincipalQuizActivity.class);
                startActivity(quiz);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemEditarPerfilM:
                Toast.makeText(this, "Editar perfil", Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawers();
                break;
            case R.id.itemDesarrolladoresM:
                Toast.makeText(this, "Desarrolladores", Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawers();
                break;
            case R.id.itemAvesM:
                Intent aves = new Intent(this, AvesActivity.class);
                startActivity(aves);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemAnfibiosM:
                Intent anfibios = new Intent(this, AnfibiosActivity.class);
                startActivity(anfibios);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemReptilesM:
                Intent reptiles = new Intent(this, ReptilesActivity.class);
                startActivity(reptiles);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemPecesM:
                Intent peces = new Intent(this, PecesActivity.class);
                startActivity(peces);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemSalirM:
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
