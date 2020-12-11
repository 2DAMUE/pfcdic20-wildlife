package com.example.animalquiz.activityQuiz1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.R;
import com.example.animalquiz.dbQuiz1.DBPref;
import com.example.animalquiz.dbQuiz1.Pregunta;
import com.example.animalquiz.fragments.DatosQuiz1Fragment;
import com.example.animalquiz.fragments.DatosQuiz2Fragment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Quiz1Activity extends AppCompatActivity implements View.OnClickListener{

    public final static int NUM_PREGUNTA = 10;
    private final static String COL_BOTON = "#778899";

    private TextView tvPregunta, tvNumPregunta;
    private int puntuacion = 0;
    private Button btnOpcion1,btnOpcion2,btnOpcion3,btnOpcion4;
    private DBPref mgtDB;
    private Stack lisPreguntas = new Stack();
    private Pregunta pregunta;
    private int numPreguntaQ1 = 1, contCorrectas = 0, contIncorrectas = 0;
    static Bundle bundle = new Bundle();

    private TextView tvAciertos, tvFallos, tvPuntuacion, tvNumPreguntas;

    private FrameLayout fl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        tvPregunta = findViewById(R.id.tvPregunta);
        tvNumPregunta = findViewById(R.id.tvNumPregunta);
        btnOpcion1 = findViewById(R.id.btnOpcion1);
        btnOpcion2 = findViewById(R.id.btnOpcion2);
        btnOpcion3 = findViewById(R.id.btnOpcion3);
        btnOpcion4 = findViewById(R.id.btnOpcion4);

        tvAciertos = findViewById(R.id.tvAciertos1);
        tvFallos = findViewById(R.id.tvFallos1);
        tvNumPreguntas = findViewById(R.id.tvPreguntasTotales1);
        tvPuntuacion = findViewById(R.id.tvPuntuacion1);

        fl1 = findViewById(R.id.f1ContenedorQ1);

        this.mgtDB = new DBPref(this);

        onBackPressed();

        Cursor preguntas = this.mgtDB.getPreguntas(DBPref.Categoria.CINE, DBPref.Dificultad.FACIL, Quiz1Activity.NUM_PREGUNTA);

        if (preguntas.moveToFirst()) {
            do {
                String pregunta = preguntas.getString(preguntas.getColumnIndex("pregunta"));
                String imagen = preguntas.getString(preguntas.getColumnIndex("imagen"));
                String sonido = preguntas.getString(preguntas.getColumnIndex("sonido"));
                String rtaCorrecta = preguntas.getString(preguntas.getColumnIndex("rtaCorrecta"));
                int tipo = preguntas.getInt(preguntas.getColumnIndex("tipo"));
                this.tvNumPregunta.setText("Pregunta: " + numPreguntaQ1 + " de 5");

                ArrayList<String> rtaIncorrectas = new ArrayList();
                rtaIncorrectas.add(preguntas.getString(preguntas.getColumnIndex("rtaIncorrecta1")));
                rtaIncorrectas.add(preguntas.getString(preguntas.getColumnIndex("rtaIncorrecta2")));
                rtaIncorrectas.add(preguntas.getString(preguntas.getColumnIndex("rtaIncorrecta3")));

                this.lisPreguntas.push(new Pregunta(pregunta, tipo, imagen, sonido, rtaCorrecta, rtaIncorrectas));
            } while (preguntas.moveToNext());
        }

        this.mgtDB.close();

        this.setPregunta((Pregunta) this.lisPreguntas.pop());

        this.btnOpcion1.setOnClickListener(this);
        this.btnOpcion2.setOnClickListener(this);
        this.btnOpcion3.setOnClickListener(this);
        this.btnOpcion4.setOnClickListener(this);
    }

    private void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;

        ArrayList<String> respuestas = new ArrayList<String>(pregunta.getRespuestas());

        this.tvPregunta.setText(pregunta.getPregunta());

        this.btnOpcion1.setText(respuestas.get(0));
        this.btnOpcion2.setText(respuestas.get(1));
        this.btnOpcion3.setText(respuestas.get(2));
        this.btnOpcion4.setText(respuestas.get(3));

        if (this.pregunta.getTipo() == 1) {

            this.modColTamTexto(true, 20);
        }
    }

    public void modColTamTexto(boolean color, int tamanho) {
        /*if (color) {
            this.btnOpcion1.setBackgroundColor(Color.parseColor(COL_BOTON));
            this.btnOpcion2.setBackgroundColor(Color.parseColor(COL_BOTON));
            this.btnOpcion3.setBackgroundColor(Color.parseColor(COL_BOTON));
            this.btnOpcion4.setBackgroundColor(Color.parseColor(COL_BOTON));
        }
        //
        this.btnOpcion1.setTextSize(tamanho);
        this.btnOpcion2.setTextSize(tamanho);
        this.btnOpcion3.setTextSize(tamanho);
        this.btnOpcion4.setTextSize(tamanho);*/
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void onClick(View view) {
        Button seleccionado = (Button) view;

        if (seleccionado.getText().toString().equals(this.pregunta.getRespuesta())) {
            this.puntuacion++;
            contCorrectas = contCorrectas + 1;
            numPreguntaQ1++;
            onBackPressed();

            Iterator iterator = this.lisPreguntas.iterator();
            if (iterator.hasNext()) {
                Toast.makeText(this, "¡CORRECTO!", Toast.LENGTH_SHORT).show();
                this.setPregunta((Pregunta) this.lisPreguntas.pop());
                this.tvNumPregunta.setText("Pregunta: " + numPreguntaQ1 + " de 5");
                fl1.setVisibility(View.GONE);
            }else {

                fl1.setVisibility(View.VISIBLE);

                this.btnOpcion1.setEnabled(false);
                this.btnOpcion2.setEnabled(false);
                this.btnOpcion3.setEnabled(false);
                this.btnOpcion4.setEnabled(false);

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                DatosQuiz1Fragment dq1 = new DatosQuiz1Fragment();

                bundle.putInt("numCorrectasQ1", contCorrectas);
                bundle.putInt("numIncorrectasQ1", contIncorrectas);
                bundle.putInt("puntuacionQ1", puntuacion);
                bundle.putInt("numPreguntasQ1", numPreguntaQ1);

                dq1.setArguments(bundle);

                //Informacion que quiero transmitir al fragment
                Bundle argumentos = new Bundle();

                ft.add(R.id.f1ContenedorQ1, dq1);
                ft.addToBackStack(null);
                ft.commit();
            }
        }else {
            contIncorrectas = contIncorrectas + 1;
            puntuacion = puntuacion - 1;
            numPreguntaQ1++;

            Iterator iterator = this.lisPreguntas.iterator();
            if (iterator.hasNext()) {
                Toast.makeText(this, "¡INCORRECTO!", Toast.LENGTH_SHORT).show();
                this.setPregunta((Pregunta) this.lisPreguntas.pop());
                this.tvNumPregunta.setText("Pregunta: " + numPreguntaQ1 + " de 5");
                fl1.setVisibility(View.GONE);

            }else {

                fl1.setVisibility(View.VISIBLE);

                this.btnOpcion1.setEnabled(false);
                this.btnOpcion2.setEnabled(false);
                this.btnOpcion3.setEnabled(false);
                this.btnOpcion4.setEnabled(false);

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                DatosQuiz1Fragment dq1 = new DatosQuiz1Fragment();

                bundle.putInt("numCorrectasQ1", contCorrectas);
                bundle.putInt("numIncorrectasQ1", contIncorrectas);
                bundle.putInt("puntuacionQ1", puntuacion);
                bundle.putInt("numPreguntasQ1", numPreguntaQ1);

                dq1.setArguments(bundle);

                //Informacion que quiero transmitir al fragment
                Bundle argumentos = new Bundle();

                ft.add(R.id.f1ContenedorQ1, dq1);
                ft.addToBackStack(null);
                ft.commit();
            }
        }
    }

    @Override public void onBackPressed() {
        moveTaskToBack(false);
    }

}
