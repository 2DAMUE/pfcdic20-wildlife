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
import com.example.animalquiz.adapters.PecesAdapter;
import com.example.animalquiz.javabean.DatosPeces;
import com.example.animalquiz.javabean.Peces;

public class PecesActivity extends AppCompatActivity {

    static final String CLAVE_PECES = "PECES";
    RecyclerView rv;
    LinearLayoutManager llm;
    PecesAdapter pa;

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
                int i = rv.indexOfChild(v);

                //Obtenemos los datos del ave seleccionado.
                Peces p = datosPeces.getListaPeces().get(i);

                Intent intent = new Intent(getApplicationContext(), DatosPecesCompletosActivity.class);
                intent.putExtra(CLAVE_PECES, p);
                startActivity(intent);
            }
        });

        rv.setAdapter(pa);
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
