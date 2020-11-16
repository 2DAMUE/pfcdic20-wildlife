package com.example.animalquiz.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import uk.co.senab.photoview.PhotoViewAttacher;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.R;
import com.example.animalquiz.javabean.DatosMamiferos;
import com.example.animalquiz.javabean.Mamiferos;

public class DatosMamiferosCompletosActivity extends AppCompatActivity {

    private TextView tvContinente;
    private ImageView imgFotoAnimal;
    private TextView tvClase;
    private TextView tvNomAnimal;
    private TextView tvPesoAdulto;
    private TextView tvLongitudAdulto;
    private TextView tvPromedioVida;
    private TextView tvAlimentacion;
    private TextView tvPeligroso;
    private TextView tvDondeVive;
    private ImageView imgFotoContinenteM;
    private ImageView imgAudioM;

    private PhotoViewAttacher photoViewAttacher;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_mamiferos_completos);

        tvContinente = findViewById(R.id.tvContinenteM);
        tvNomAnimal = findViewById(R.id.tvNomMamifero);
        imgFotoAnimal = findViewById(R.id.imgAnimal);
        tvClase = findViewById(R.id.tvClaseM);
        tvPesoAdulto = findViewById(R.id.tvPesoAdultoM);
        tvLongitudAdulto = findViewById(R.id.tvLongitudAdultoM);
        tvPromedioVida = findViewById(R.id.tvPromedioVidaM);
        tvAlimentacion = findViewById(R.id.tvAlimentacionM);
        tvPeligroso = findViewById(R.id.tvPeligrosoM);
        tvDondeVive = findViewById(R.id.tvDondeViveM);
        imgFotoContinenteM = findViewById(R.id.imgContinenteM);
        imgAudioM = findViewById(R.id.imgAudioM);

        final Mamiferos m = getIntent().getParcelableExtra(MamiferosActivity.CLAVE_MAMIFERO);

        tvNomAnimal.setText(Html.fromHtml("<strong><big> " + m.getNombreM() + "</big></strong>"));
        imgFotoContinenteM.setImageResource(m.getIdFotoContinenteM());
        imgFotoAnimal.setImageResource(m.getIdFotoAnimal());
        tvClase.setText(Html.fromHtml("<strong>Clase:</strong>" + " <br><small>" + m.getClaseM() + "</br></small>"));
        tvPesoAdulto.setText(Html.fromHtml("<strong>Peso adulto</strong>: " + " <br><small>" + m.getPesoAdultoM() + "</br></small>"));
        tvLongitudAdulto.setText(Html.fromHtml("<strong>Longitud adulto:</strong> " + " <br><small>" + m.getLongitudAdultoM() + "</br></small>"));
        tvPromedioVida.setText(Html.fromHtml("<strong>Promedio vida:</strong> " + " <br><small>" + m.getPromedioVidaM() + "</br></samll>"));
        tvAlimentacion.setText(Html.fromHtml("<strong>Alimentacion:</strong> " + " <br><small>" + m.getAlimentacionM() + "</br></samll>"));
        tvPeligroso.setText(Html.fromHtml("<strong>Peligroso:</strong> " + " <br><small>" + m.getPeligrosoM() + "</br></samll>"));
        tvDondeVive.setText(Html.fromHtml("<strong>¿Dónde vive?:</strong> " + " <br><small>" + m.getDondeViveM() + "</br></samll>"));
        tvContinente.setText(Html.fromHtml("<strong>Continente:</strong> " + " <br><small>" + m.getContinenteM() + "</br></samll>"));


        photoViewAttacher = new PhotoViewAttacher(imgFotoAnimal);

        imgAudioM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer sonidoMamifero = MediaPlayer.create(DatosMamiferosCompletosActivity.this, m.getIdSonidoAnimal());
                sonidoMamifero.start();
            }
        });
    }
}