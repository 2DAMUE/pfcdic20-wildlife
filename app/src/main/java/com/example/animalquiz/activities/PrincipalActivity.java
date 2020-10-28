package com.example.animalquiz.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.R;
import com.example.animalquiz.fragments.MantenimientoFragment;

public class PrincipalActivity extends AppCompatActivity {

    ConstraintLayout cl;
    int contador = 0;

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        linearLayout = findViewById(R.id.linearLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.itemQuiz){

            Intent i = new Intent(this, PrincipalQuizActivity.class);
            startActivity(i);

        }else if (item.getItemId() == R.id.itemEditarPerfil){

            Toast.makeText(this, "Se abrira la pagina de desarrolladores", Toast.LENGTH_SHORT).show();

        }else if (item.getItemId() == R.id.itemSalir){

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

        }else if (item.getItemId() == R.id.itemDesarrolladores){

            AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
            dialogo1.setTitle("Mantenimiento");
            dialogo1.setIcon(R.drawable.iconomantenimiento);
            dialogo1.setMessage(Html.fromHtml("No se puede acceder debido a que está en mantenimiento!!." + "<br><br>" + "Sentimos las molestias"));
            dialogo1.setCancelable(false);
            dialogo1.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    Intent i = new Intent(PrincipalActivity.this, PrincipalActivity.class);
                    startActivity(i);
                }
            });
            dialogo1.show();

        }

        return super.onOptionsItemSelected(item);
    }

    public void entrarMamiferos (View v){
        Intent mamiferos = new Intent(this, MamiferosActivity.class);
        startActivity(mamiferos);
    }

    public void entrarAves (View v) {
        Intent aves = new Intent(this, AvesActivity.class);
        startActivity(aves);
    }

    public void entrarAnfibios (View v) {
        Intent anfibios = new Intent(this, AnfibiosActivity.class);
        startActivity(anfibios);
    }

    public void entrarReptiles (View v) {
        Intent reptiles = new Intent(this, ReptilesActivity.class);
        startActivity(reptiles);
    }

    public void entrarPeces (View v) {
        Intent peces = new Intent(this, PecesActivity.class);
        startActivity(peces);
    }

    @Override public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}