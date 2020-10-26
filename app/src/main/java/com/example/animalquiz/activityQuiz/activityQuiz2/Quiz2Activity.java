package com.example.animalquiz.activityQuiz.activityQuiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.animalquiz.R;
import com.example.animalquiz.activityQuiz.PrincipalQuizActivity;
import com.example.animalquiz.db.DBPref;
import com.example.animalquiz.db.Pregunta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Quiz2Activity extends AppCompatActivity implements View.OnClickListener{

    public final static int NUM_PREGUNTA = 4;
    private final static String COL_BOTON = "#778899";

    private TextView tvPregunta;
    private int puntuacion;
    private Button btnOpcion1,btnOpcion2,btnOpcion3,btnOpcion4;
    private DBPref mgtDB;
    private Stack lisPreguntas = new Stack();
    private Pregunta pregunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        tvPregunta = findViewById(R.id.tvPregunta);
        btnOpcion1 = findViewById(R.id.btnOpcion1);
        btnOpcion2 = findViewById(R.id.btnOpcion2);
        btnOpcion3 = findViewById(R.id.btnOpcion3);
        btnOpcion4 = findViewById(R.id.btnOpcion4);

        this.mgtDB = new DBPref(this);

        Cursor preguntas = this.mgtDB.getPreguntas(DBPref.Categoria.CINE, DBPref.Dificultad.FACIL, Quiz2Activity.NUM_PREGUNTA);

        if (preguntas.moveToFirst()) {
            do {
                String pregunta = preguntas.getString(preguntas.getColumnIndex("pregunta"));
                String imagen = preguntas.getString(preguntas.getColumnIndex("imagen"));
                String sonido = preguntas.getString(preguntas.getColumnIndex("sonido"));
                String rtaCorrecta = preguntas.getString(preguntas.getColumnIndex("rtaCorrecta"));
                int tipo = preguntas.getInt(preguntas.getColumnIndex("tipo"));

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
        if (color) {
            this.btnOpcion1.setBackgroundColor(Color.parseColor(COL_BOTON));
            this.btnOpcion2.setBackgroundColor(Color.parseColor(COL_BOTON));
            this.btnOpcion3.setBackgroundColor(Color.parseColor(COL_BOTON));
            this.btnOpcion4.setBackgroundColor(Color.parseColor(COL_BOTON));
        }
        //
        this.btnOpcion1.setTextSize(tamanho);
        this.btnOpcion2.setTextSize(tamanho);
        this.btnOpcion3.setTextSize(tamanho);
        this.btnOpcion4.setTextSize(tamanho);
    }

    public void onClick(View view) {
        Button seleccionado = (Button) view;

        if (seleccionado.getText().toString().equals(this.pregunta.getRespuesta())) {
            this.puntuacion++;

            Iterator iterator = this.lisPreguntas.iterator();
            if (iterator.hasNext()) {
                Toast.makeText(this, "¡CORRECTO!", Toast.LENGTH_SHORT).show();
                this.setPregunta((Pregunta) this.lisPreguntas.pop());
            }else {
                this.startActivity(new Intent(Quiz2Activity.this, PrincipalQuizActivity.class));
            }
        }else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder
                    .setMessage("Te equivocaste :(, puedes volver a intentarlo pero te restará otro punto...")
                    .setPositiveButton("Seguir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            puntuacion -= 2;
                        }
                    })
                    .setNegativeButton("Empezar de vuelta", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    })
                    .show();
        }
    }
}