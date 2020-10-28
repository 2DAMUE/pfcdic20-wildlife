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
import com.example.animalquiz.javabean.Peces;

import uk.co.senab.photoview.PhotoViewAttacher;

public class DatosPecesCompletosActivity extends AppCompatActivity {

    private TextView tvContinenteP;
    private ImageView imgFotoAnimalP;
    private TextView tvClaseP;
    private TextView tvNomAnimalP;
    private TextView tvPesoAdultoP;
    private TextView tvLongitudAdultoP;
    private TextView tvPromedioVidaP;
    private TextView tvAlimentacionP;
    private TextView tvPeligrosoP;
    private TextView tvDondeViveP;
    private ImageView imgFotoContinenteP;

    private PhotoViewAttacher photoViewAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_peces_completos);

        tvContinenteP = findViewById(R.id.tvContinenteP);
        tvNomAnimalP = findViewById(R.id.tvNomP);
        imgFotoAnimalP = findViewById(R.id.imgAnimalP);
        tvClaseP = findViewById(R.id.tvClaseP);
        tvPesoAdultoP = findViewById(R.id.tvPesoAdultoP);
        tvLongitudAdultoP = findViewById(R.id.tvLongitudAdultoP);
        tvPromedioVidaP = findViewById(R.id.tvPromedioVidaP);
        tvAlimentacionP = findViewById(R.id.tvAlimentacionP);
        tvPeligrosoP = findViewById(R.id.tvPeligrosoP);
        tvDondeViveP = findViewById(R.id.tvDondeViveP);
        imgFotoContinenteP = findViewById(R.id.imgContinenteP);

        Peces p = getIntent().getParcelableExtra(PecesActivity.CLAVE_PECES);

        tvNomAnimalP.setText(Html.fromHtml("<strong><big> " +p.getNombreP() + "</big></strong>"));
        imgFotoContinenteP.setImageResource(p.getIdFotoContinenteP());
        imgFotoAnimalP.setImageResource(p.getIdFotoAnimalP());
        tvClaseP.setText(Html.fromHtml("<strong>Clase:</strong> " + " <br><small>" + p.getClaseP() + "</br></small>"));
        tvPesoAdultoP.setText(Html.fromHtml("<strong>Peso adulto:</strong> " + " <br><small>" + p.getPesoAdultoP() + "</br></small>"));
        tvLongitudAdultoP.setText(Html.fromHtml("<strong>Longitud adulto:</strong> " + " <br><small>" + p.getLongitudAdultoP() + "</br></small>"));
        tvPromedioVidaP.setText(Html.fromHtml("<strong>Promedio vida:</strong> " + " <br><small>" + p.getPromedioVidaP() + "</br></small>"));
        tvAlimentacionP.setText(Html.fromHtml("<strong>Alimentación:</strong> " + " <br><small>" + p.getAlimentacionP() + "</br></small>"));
        tvPeligrosoP.setText(Html.fromHtml("<strong>Peligroso:</strong> " + " <br><small>" + p.getPeligrosoP() + "</br></small>"));
        tvDondeViveP.setText(Html.fromHtml("<strong>Dónde vive:</strong> " + " <br><small>" + p.getDondeViveP() + "</br></small>"));
        tvContinenteP.setText(Html.fromHtml("<strong>Continente:</strong> " + " <br><small>" + p.getContinenteP() + "</br></small>"));

        photoViewAttacher = new PhotoViewAttacher(imgFotoAnimalP);
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
