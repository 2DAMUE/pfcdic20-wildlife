package com.example.animalquiz.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.R;
import com.example.animalquiz.javabean.Aves;

import uk.co.senab.photoview.PhotoViewAttacher;

public class DatosAvesCompletosActivity extends AppCompatActivity {

    private TextView tvContinenteA;
    private ImageView imgFotoAnimalA;
    private TextView tvClaseA;
    private TextView tvNomAnimalA;
    private TextView tvPesoAdultoA;
    private TextView tvLongitudAdultoA;
    private TextView tvPromedioVidaA;
    private TextView tvAlimentacionA;
    private TextView tvPeligrosoA;
    private TextView tvDondeViveA;
    private ImageView imgFotoContinenteA;

    private PhotoViewAttacher photoViewAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_aves_completos);

        tvContinenteA = findViewById(R.id.tvContinenteA);
        tvNomAnimalA = findViewById(R.id.tvNomA);
        imgFotoAnimalA = findViewById(R.id.imgAnimalA);
        tvClaseA = findViewById(R.id.tvClaseA);
        tvPesoAdultoA = findViewById(R.id.tvPesoAdultoA);
        tvLongitudAdultoA = findViewById(R.id.tvLongitudAdultoA);
        tvPromedioVidaA = findViewById(R.id.tvPromedioVidaA);
        tvAlimentacionA = findViewById(R.id.tvAlimentacionA);
        tvPeligrosoA = findViewById(R.id.tvPeligrosoA);
        tvDondeViveA = findViewById(R.id.tvDondeViveA);
        imgFotoContinenteA = findViewById(R.id.imgContinenteA);

        Aves a = getIntent().getParcelableExtra(AvesActivity.CLAVE_AVES);

        tvNomAnimalA.setText(Html.fromHtml("<strong><big> " + a.getNombreA() + "</big></strong>"));
        imgFotoContinenteA.setImageResource(a.getIdFotoContinenteA());
        imgFotoAnimalA.setImageResource(a.getIdFotoAnimalA());
        tvClaseA.setText(Html.fromHtml("<strong>Clase:</strong> " + " <br><small>" + a.getClaseA() + "</br></small>"));
        tvPesoAdultoA.setText(Html.fromHtml("<strong>Peso adulto:</strong> " + " <br><small>" + a.getPesoAdultoA() + "</br></small>"));
        tvLongitudAdultoA.setText(Html.fromHtml("<strong>Longitud adulto:</strong> " + " <br><small>" + a.getLongitudAdultoA() + "</br></small>"));
        tvPromedioVidaA.setText(Html.fromHtml("<strong>Promedio vida:</strong> " + " <br><small>" + a.getPromedioVidaA() + "</br></small>"));
        tvAlimentacionA.setText(Html.fromHtml("<strong>Alimentación:</strong> " + " <br><small>" + a.getAlimentacionA() + "</br></small>"));
        tvPeligrosoA.setText(Html.fromHtml("<strong>Peligroso:</strong> " + " <br><small>" + a.getPeligrosoA() + "</br></small>"));
        tvDondeViveA.setText(Html.fromHtml("<strong>Dónde vive:</strong> " + " <br><small>" + a.getDondeViveA() + "</br></small>"));
        tvContinenteA.setText(Html.fromHtml("<strong>Continente:</strong> " + " <br><small>" + a.getContinenteA() + "</br></small>"));

        photoViewAttacher = new PhotoViewAttacher(imgFotoAnimalA);
    }
}
