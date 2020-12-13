package com.example.animalquiz.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.animalquiz.ActivityMapaAnfibios;
import com.example.animalquiz.ActivityMapaPeces;
import com.example.animalquiz.ActivityMapaReptiles;
import com.example.animalquiz.R;
import com.example.animalquiz.mapasActivity.ActivityMapaAves;
import com.example.animalquiz.mapasActivity.ActivityMapaMamiferos;

public class MapsPrincipalActivity extends AppCompatActivity {

    Button btnMapa;
    Button btnMapaAves;
    Button btnAnfi;
    Button btnRep;
    Button btnPec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_principal);

        btnMapa = (Button) findViewById(R.id.btnMapa);
        btnMapaAves = (Button) findViewById(R.id.buttonMapaAves);
        btnAnfi = (Button) findViewById(R.id.btnMapaAnfibios);
        btnRep = (Button) findViewById(R.id.btnReptiles);
        btnPec = (Button) findViewById(R.id.btnPeces);

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMapaMamiferos.class);

                startActivity(intent);
            }
        });

        btnMapaAves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMapaAves.class);

                startActivity(intent);



            }
        });

        btnAnfi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMapaAnfibios.class);

                startActivity(intent);



            }
        });

        btnRep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMapaReptiles.class);

                startActivity(intent);



            }
        });

        btnPec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMapaPeces.class);

                startActivity(intent);



            }
        });
    }

}
