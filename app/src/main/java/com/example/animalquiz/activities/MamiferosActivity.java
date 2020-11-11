package com.example.animalquiz.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.R;
import com.example.animalquiz.adapters.MamiferoAdapter;
import com.example.animalquiz.javabean.DatosMamiferos;
import com.example.animalquiz.javabean.Mamiferos;

public class MamiferosActivity extends AppCompatActivity {

    static final String CLAVE_MAMIFERO = "MAMIFEROS";
    RecyclerView rv;
    LinearLayoutManager llm;
    MamiferoAdapter ma;

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
                int i = rv.indexOfChild(v);

                //Obtenemos los datos del ave seleccionado.
                Mamiferos m = datosMamiferos.getListaMamiferos().get(i);

                Intent intent = new Intent(getApplicationContext(), DatosMamiferosCompletosActivity.class);
                intent.putExtra(CLAVE_MAMIFERO, m);
                startActivity(intent);
            }
        });

        rv.setAdapter(ma);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_resto, menu);

        return super.onCreateOptionsMenu(menu);
    }

    public void entrarPrincipal(View v){
        Intent intent = new Intent(this, PrincipalActivity.class);
        startActivity(intent);
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
            dialogo1.setTitle("Mantenimiento");
            dialogo1.setIcon(R.drawable.iconomantenimiento);
            dialogo1.setMessage(Html.fromHtml("No se puede acceder debido a que está en mantenimiento!!." + "<br><br>" + "Sentimos las molestias"));
            dialogo1.setCancelable(false);
            dialogo1.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    dialogo1.dismiss();
                }
            });
            dialogo1.show();

        }else if (item.getItemId() == R.id.itemDesarrolladoresResto) {

            AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
            dialogo1.setTitle("Mantenimiento");
            dialogo1.setIcon(R.drawable.iconomantenimiento);
            dialogo1.setMessage(Html.fromHtml("No se puede acceder debido a que está en mantenimiento!!." + "<br><br>" + "Sentimos las molestias"));
            dialogo1.setCancelable(false);
            dialogo1.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    dialogo1.dismiss();
                }
            });

            dialogo1.show();
        }

        return super.onOptionsItemSelected(item);
    }
}
