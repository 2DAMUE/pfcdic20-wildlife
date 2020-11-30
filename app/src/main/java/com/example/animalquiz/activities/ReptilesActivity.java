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
import com.example.animalquiz.adapters.ReptilesAdapter;
import com.example.animalquiz.javabean.DatosReptiles;
import com.example.animalquiz.javabean.Reptiles;
import com.google.android.material.navigation.NavigationView;

public class ReptilesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    static final String CLAVE_REPTILES = "REPTILES";
    RecyclerView rv;
    LinearLayoutManager llm;
    ReptilesAdapter ra;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reptiles);

        final DatosReptiles datosReptiles = new DatosReptiles();

        rv = findViewById(R.id.rvReptiles);

        rv.setHasFixedSize(true);

        ra = new ReptilesAdapter(datosReptiles.getListaReptiles());

        llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        ra.asignacionOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = rv.getChildAdapterPosition(v);

                //Obtenemos los datos del ave seleccionado.
                Reptiles r = datosReptiles.getListaReptiles().get(i);

                Intent intent = new Intent(getApplicationContext(), DatosReptilesCompletosActivity.class);
                intent.putExtra(CLAVE_REPTILES, r);
                startActivity(intent);
            }
        });

        rv.setAdapter(ra);

        toolbar = findViewById(R.id.toolbarReptiles);
        drawerLayout = findViewById(R.id.drawerReptiles);
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
            case R.id.itemHomeR:
                Intent i = new Intent(this, PrincipalActivity.class);
                startActivity(i);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemEditarPerfilR:
                Toast.makeText(this, "Editar perfil", Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawers();
                break;
            case R.id.itemDesarrolladoresR:
                Toast.makeText(this, "Desarrolladores", Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawers();
                break;
            case R.id.itemAvesR:
                Intent aves = new Intent(this, AvesActivity.class);
                startActivity(aves);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemAnfibiosR:
                Intent anfibios = new Intent(this, AnfibiosActivity.class);
                startActivity(anfibios);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemMamiferosR:
                Intent reptiles = new Intent(this, ReptilesActivity.class);
                startActivity(reptiles);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemPecesR:
                Intent peces = new Intent(this, PecesActivity.class);
                startActivity(peces);
                drawerLayout.closeDrawers();
                break;
            case R.id.itemSalirR:
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
