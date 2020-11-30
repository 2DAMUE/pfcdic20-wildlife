package com.example.animalquiz.activityQuiz2;

import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.animalquiz.R;
import com.example.animalquiz.dbQuiz1.Pregunta;
import com.example.animalquiz.dbQuiz2.DBPref2;
import com.example.animalquiz.fragments.DatosQuiz2Fragment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Quiz2Activity extends AppCompatActivity implements View.OnClickListener{

    public final static int NUM_PREGUNTA = 4;
    private final static String COL_BOTON = "#778899";

    private TextView tvPregunta, tvNumPregunta;
    private int puntuacionQ2;
    private Button btnOpcion1,btnOpcion2,btnOpcion3,btnOpcion4;
    private DBPref2 mgtDB;
    private ImageView imgFotoPregunta;
    private Stack lisPreguntas = new Stack();
    private Pregunta pregunta;
    private int numPregunta = 1, numAciertos = 0, numFallos = 0;
    static Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        onBackPressed();

        tvPregunta = findViewById(R.id.tvPregunta);
        tvNumPregunta = findViewById(R.id.tvNumPreguntasQ2);
        btnOpcion1 = findViewById(R.id.btnOpcion1);
        btnOpcion2 = findViewById(R.id.btnOpcion2);
        btnOpcion3 = findViewById(R.id.btnOpcion3);
        btnOpcion4 = findViewById(R.id.btnOpcion4);
        imgFotoPregunta = findViewById(R.id.imgFotoPregunta);

        this.mgtDB = new DBPref2(this);

        Cursor preguntas = this.mgtDB.getPreguntas(DBPref2.Categoria.CINE, DBPref2.Dificultad.FACIL, Quiz2Activity.NUM_PREGUNTA);

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

        if (this.pregunta.getTipo() == 2) {

            this.imgFotoPregunta.setBackgroundResource(getResources().getIdentifier(this.pregunta.getImagen(), "drawable", getPackageName()));
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
            puntuacionQ2++;
            numPregunta++;
            numAciertos++;

            Iterator iterator = this.lisPreguntas.iterator();
            if (iterator.hasNext()) {
                Toast.makeText(this, "¡CORRECTO!", Toast.LENGTH_SHORT).show();
                this.setPregunta((Pregunta) this.lisPreguntas.pop());
                tvNumPregunta.setText("Pregunta: " + numPregunta + " de 4");

            }else {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                DatosQuiz2Fragment dq1 = new DatosQuiz2Fragment();

                bundle.putInt("numCorrectasQ2", numAciertos);
                bundle.putInt("numIncorrectasQ2", numFallos);
                bundle.putInt("puntuacionQ2", puntuacionQ2);
                bundle.putInt("numPreguntasQ2", numPregunta);

                dq1.setArguments(bundle);

                //Informacion que quiero transmitir al fragment
                Bundle argumentos = new Bundle();

                ft.add(R.id.f1ContenedorQ2, dq1);
                ft.addToBackStack(null);
                ft.commit();
            }
        }else {
            numPregunta++;
            puntuacionQ2--;
            numFallos++;

            Iterator iterator = this.lisPreguntas.iterator();
            if (iterator.hasNext()) {
                Toast.makeText(this, "¡INCORRECTO!", Toast.LENGTH_SHORT).show();
                this.setPregunta((Pregunta) this.lisPreguntas.pop());
                tvNumPregunta.setText("Pregunta: " + numPregunta + " de 4");

            }else {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                DatosQuiz2Fragment dq1 = new DatosQuiz2Fragment();

                bundle.putInt("numCorrectasQ2", numAciertos);
                bundle.putInt("numIncorrectasQ2", numFallos);
                bundle.putInt("puntuacionQ2", puntuacionQ2);
                bundle.putInt("numPreguntasQ2", numPregunta);

                dq1.setArguments(bundle);

                //Informacion que quiero transmitir al fragment
                Bundle argumentos = new Bundle();

                ft.add(R.id.f1ContenedorQ2, dq1);
                ft.addToBackStack(null);
                ft.commit();
            }
        }
    }

    @Override public void onBackPressed() {
        moveTaskToBack(false);
    }
}
