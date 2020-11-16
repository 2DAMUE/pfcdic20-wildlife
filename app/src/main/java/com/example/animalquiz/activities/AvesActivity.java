package com.example.animalquiz.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
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
import com.example.animalquiz.adapters.AvesAdapter;
import com.example.animalquiz.javabean.Aves;
import com.example.animalquiz.javabean.DatosAves;

public class AvesActivity extends AppCompatActivity {

    static final String CLAVE_AVES = "AVES";
    RecyclerView rv;
    LinearLayoutManager llm;
    AvesAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aves);

        final DatosAves datosAves = new DatosAves();

        rv = findViewById(R.id.rvAves);

        aa = new AvesAdapter(datosAves.getListaAves());

        llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        rv.setAdapter(aa);

        aa.asignacionOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = rv.getChildAdapterPosition(v);

                Aves a = datosAves.getListaAves().get(i);

                Intent intent = new Intent(AvesActivity.this, DatosAvesCompletosActivity.class);
                intent.putExtra("AVES", a);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_resto, menu);

        return super.onCreateOptionsMenu(menu);
    }

    public void entrarPrincipal(View v){
        Intent i = new Intent(this, PrincipalActivity.class);
        startActivity(i);
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
