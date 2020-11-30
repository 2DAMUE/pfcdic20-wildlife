package com.example.animalquiz.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
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
import com.example.animalquiz.adapters.PecesAdapter;
import com.example.animalquiz.javabean.DatosPeces;
import com.example.animalquiz.javabean.Peces;
import com.google.android.material.navigation.NavigationView;

public class PecesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    static final String CLAVE_PECES = "PECES";
    RecyclerView rv;
    LinearLayoutManager llm;
    PecesAdapter pa;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peces);

        final DatosPeces datosPeces = new DatosPeces();

        rv = findViewById(R.id.rvPeces);

        rv.setHasFixedSize(true);

        pa = new PecesAdapter(datosPeces.getListaPeces());

        llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        pa.asignacionOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = rv.getChildAdapterPosition(v);

                //Obtenemos los datos del ave seleccionado.
                Peces p = datosPeces.getListaPeces().get(i);

                Intent intent = new Intent(getApplicationContext(), DatosPecesCompletosActivity.class);
                intent.putExtra(CLAVE_PECES, p);
                startActivity(intent);
            }
        });

        rv.setAdapter(pa);

        toolbar = findViewById(R.id.toolbarPeces);
        drawerLayout = findViewById(R.id.drawerPeces);
        navigationView = findViewById(R.id.navigationView);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.bringToFront();

        drawerLayout.setDrawerTitle(GravityCompat.END, "WildLife");

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.itemHomeP:
                Intent i = new Intent(this, PrincipalActivity.class);
                startActivity(i);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemEditarPerfilP:
                Toast.makeText(this, "Editar perfil", Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawers();
                break;
            case R.id.itemDesarrolladoresP:
                Toast.makeText(this, "Desarrolladores", Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawers();
                break;
            case R.id.itemAvesP:
                Intent aves = new Intent(this, AvesActivity.class);
                startActivity(aves);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemAnfibiosP:
                Intent anfibios = new Intent(this, AnfibiosActivity.class);
                startActivity(anfibios);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemReptilesP:
                Intent reptiles = new Intent(this, ReptilesActivity.class);
                startActivity(reptiles);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemMamiferosP:
                Intent peces = new Intent(this, MamiferosActivity.class);
                startActivity(peces);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemSalirP:
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

        return false;
    }

    @Override public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
