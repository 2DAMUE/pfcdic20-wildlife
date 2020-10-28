package com.example.animalquiz.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.R;
import com.example.animalquiz.adapters.ReptilesAdapter;
import com.example.animalquiz.javabean.DatosReptiles;
import com.example.animalquiz.javabean.Reptiles;

public class ReptilesActivity extends AppCompatActivity {

    static final String CLAVE_REPTILES = "REPTILES";
    RecyclerView rv;
    LinearLayoutManager llm;
    ReptilesAdapter ra;

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
                int i = rv.indexOfChild(v);

                //Obtenemos los datos del ave seleccionado.
                Reptiles r = datosReptiles.getListaReptiles().get(i);

                Intent intent = new Intent(getApplicationContext(), DatosReptilesCompletosActivity.class);
                intent.putExtra(CLAVE_REPTILES, r);
                startActivity(intent);
            }
        });

        rv.setAdapter(ra);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_resto, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.itemHomeResto){

            Intent i = new Intent(this, PrincipalActivity.class);
            startActivity(i);

        }else if (item.getItemId() == R.id.itemQuizResto){

            Intent i = new Intent(this, PrincipalQuizActivity.class);
            startActivity(i);

        }else if (item.getItemId() == R.id.itemEditarPerfilResto){

            AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
            dialogo1.setTitle("Salir app");
            dialogo1.setMessage("¿ Desea salir de la app ?");
            dialogo1.setCancelable(false);
            dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    finish();
                }
            });
            dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    dialogo1.dismiss();
                }
            });
            dialogo1.show();
        }

        return super.onOptionsItemSelected(item);
    }
}
