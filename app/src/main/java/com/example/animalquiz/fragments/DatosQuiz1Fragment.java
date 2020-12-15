package com.example.animalquiz.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.R;
import com.example.animalquiz.activityQuiz1.RespuestasQ1Activity;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatosQuiz1Fragment extends Fragment {

    private int numCorrectas;
    private int numIncorrectas;
    private int puntuacion;
    private int numPreguntas;
    private TextView tvPuntuacion, tvCorrectasF, tvIncorrectasF, tvPreguntasTotales, tvFraseQ1;
    private Button btnContinuarF;
    private ProgressBar pbCarga;
    private Button resultados;

    public DatosQuiz1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_datos_quiz1, container, false);

        tvPuntuacion = view.findViewById(R.id.tvPuntuacion1);
        btnContinuarF = view.findViewById(R.id.btnContinuarF);
        tvCorrectasF = view.findViewById(R.id.tvAciertos1);
        tvIncorrectasF = view.findViewById(R.id.tvFallos1);
        tvFraseQ1 = view.findViewById(R.id.tvFraseQuiz1);
        tvPreguntasTotales = view.findViewById(R.id.tvPreguntasTotales1);
        pbCarga = view.findViewById(R.id.pbCarga1);

        resultados = view.findViewById(R.id.btn_ver_resultados);

        numCorrectas = getArguments().getInt("numCorrectasQ1");
        numIncorrectas = getArguments().getInt("numIncorrectasQ1");
        puntuacion = getArguments().getInt("puntuacionQ1");
        numPreguntas = getArguments().getInt("numPreguntasQ1");

        pbCarga.setVisibility(View.GONE);

        numPreguntas = numPreguntas - 1;

        tvPuntuacion.setText("Puntos totales: " + numCorrectas);
        tvCorrectasF.setText("Has acertado: " + numCorrectas + " preguntas");
        tvIncorrectasF.setText("Has fallado: " + numIncorrectas + " preguntas");
        tvPreguntasTotales.setText("Preguntas realizadas: " + numPreguntas);

        seleccionarMensaje(puntuacion);

        resultados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RespuestasQ1Activity.class);
                startActivity(intent);
            }
        });

        btnContinuarF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pbCarga.setVisibility(View.VISIBLE);
                openApp(true);
            }
        });

        return view;
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getActivity(), PrincipalQuizActivity.class);
                getActivity().finish();
            }
        }, 2000);
    }

    public void seleccionarMensaje(int puntuacion){
        if (puntuacion < 5){
            tvFraseQ1.setText(Html.fromHtml("<font color=red>¡Has tenido bastantes fallos, pero siempre puedes volver a intentarlo!</font>"));

        }else if (puntuacion >= 5 && puntuacion <= 9){
            tvFraseQ1.setText("Muy bien, has acertado casi todas las preguntas");
        }else if (puntuacion == 10){
            tvFraseQ1.setText("Enhorabuena, has bordado el Test 1");
        }
    }
}
