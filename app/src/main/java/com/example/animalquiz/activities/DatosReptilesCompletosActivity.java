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
import com.example.animalquiz.javabean.Reptiles;

import uk.co.senab.photoview.PhotoViewAttacher;

public class DatosReptilesCompletosActivity extends AppCompatActivity {

    private TextView tvContinenteR;
    private ImageView imgFotoAnimalR;
    private TextView tvClaseR;
    private TextView tvNomAnimalR;
    private TextView tvPesoAdultoR;
    private TextView tvLongitudAdultoR;
    private TextView tvPromedioVidaR;
    private TextView tvAlimentacionR;
    private TextView tvPeligrosoR;
    private TextView tvDondeViveR;
    private ImageView imgFotoContinenteR;

    private PhotoViewAttacher photoViewAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_reptiles_completos);

        tvContinenteR = findViewById(R.id.tvContinenteR);
        tvNomAnimalR = findViewById(R.id.tvNomR);
        imgFotoAnimalR = findViewById(R.id.imgAnimalR);
        tvClaseR = findViewById(R.id.tvClaseR);
        tvPesoAdultoR = findViewById(R.id.tvPesoAdultoR);
        tvLongitudAdultoR = findViewById(R.id.tvLongitudAdultoR);
        tvPromedioVidaR = findViewById(R.id.tvPromedioVidaR);
        tvAlimentacionR = findViewById(R.id.tvAlimentacionR);
        tvPeligrosoR = findViewById(R.id.tvPeligrosoR);
        tvDondeViveR = findViewById(R.id.tvDondeViveR);
        imgFotoContinenteR = findViewById(R.id.imgContinenteR);

        Reptiles r = getIntent().getParcelableExtra(ReptilesActivity.CLAVE_REPTILES);

        tvNomAnimalR.setText(Html.fromHtml("<strong><big> " + r.getNombreR() + "</big></strong>"));
        imgFotoContinenteR.setImageResource(r.getIdFotoContinenteR());
        imgFotoAnimalR.setImageResource(r.getIdFotoAnimalR());
        tvClaseR.setText(Html.fromHtml("<strong>Clase:</strong> " + " <br><small>" + r.getClaseR() + "</br></small>"));
        tvPesoAdultoR.setText(Html.fromHtml("<strong>Peso adulto:</strong> " + " <br><small>" + r.getPesoAdultoR() + "</br></small>"));
        tvLongitudAdultoR.setText(Html.fromHtml("<strong>Longitud adulto:</strong> " + " <br><small>" + r.getLongitudAdultoR() + "</br></small>"));
        tvPromedioVidaR.setText(Html.fromHtml("<strong>Promedio vida:</strong> " + " <br><small>" + r.getPromedioVidaR() + "</br></small>"));
        tvAlimentacionR.setText(Html.fromHtml("<strong>Alimentación:</strong> " + " <br><small>" + r.getAlimentacionR() + "</br></small>"));
        tvPeligrosoR.setText(Html.fromHtml("<strong>Peligroso:</strong> " + " <br><small>" + r.getPeligrosoR() + "</br></small>"));
        tvDondeViveR.setText(Html.fromHtml("<strong>Dónde vive:</strong> " + " <br><small>" + r.getDondeViveR() + "</br></small>"));
        tvContinenteR.setText(Html.fromHtml("<strong>Continente:</strong> " + " <br><small>" + r.getContinenteR() + "</br></small>"));

        photoViewAttacher = new PhotoViewAttacher(imgFotoAnimalR);
    }
}
