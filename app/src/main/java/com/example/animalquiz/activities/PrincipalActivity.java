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

    public void entrarQuizPrincipal(View v){
        Intent entrarQuizPrincipal = new Intent(this, PrincipalQuizActivity.class);
        startActivity(entrarQuizPrincipal);
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